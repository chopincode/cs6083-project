package com.project.cs6083.rest.auto;

import com.project.cs6083.entity.Customer;
import com.project.cs6083.entity.InsurancePolicy;
import com.project.cs6083.entity.auto.AutoUnderPolicy;
import com.project.cs6083.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer/{id}/policy/{policyNumber}")
@CrossOrigin
public class AutoController {

    private CustomerService customerService;

    @Autowired
    public AutoController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/auto")
    public List<AutoUnderPolicy> autos(@PathVariable int id, @PathVariable int policyNumber) {
        List<InsurancePolicy> policies = customerService.findById(id).getInsurancePolicies();
        for(InsurancePolicy policy : policies) {
            if (policy.getPolicyNumber() == policyNumber) {
                return policy.getAutoPolicy().getAutoUnderPolicy();
            }
        }

        throw new RuntimeException("This customer does not have any auto under this policy");
    }

    @GetMapping("/auto/{autoId}")
    public AutoUnderPolicy auto(@PathVariable int id, @PathVariable int policyNumber, @PathVariable int autoId) {
        List<InsurancePolicy> policies = customerService.findById(id).getInsurancePolicies();
        for(InsurancePolicy policy : policies) {
            if (policy.getPolicyNumber() == policyNumber) {
                for (AutoUnderPolicy auto : policy.getAutoPolicy().getAutoUnderPolicy()) {
                    if (auto.getAutoId() == autoId) {
                        return auto;
                    }
                }
            }
        }

        throw new RuntimeException("This customer does not have any auto with this id under this policy");
    }

    @PostMapping("/auto")
    public ResponseEntity<?> addNewAuto(@RequestBody AutoUnderPolicy auto, @PathVariable int id, @PathVariable int policyNumber) {
        Optional<Customer> customerOptional = Optional.of(customerService.findById(id));
        if (!customerOptional.isPresent()) return ResponseEntity.notFound().build();

        Customer customer = customerOptional.get();
        List<InsurancePolicy> policies = customer.getInsurancePolicies();
        InsurancePolicy policyToEdit = null;
        for(InsurancePolicy policy : policies) {
            if (policy.getPolicyNumber() == policyNumber) {
                policyToEdit = policy;
                break;
            }
        }

        policyToEdit.getAutoPolicy().addNewAuto(auto);
        customer.setId(id);
        customerService.save(customer);

        return ResponseEntity.noContent().build();
    }
}
