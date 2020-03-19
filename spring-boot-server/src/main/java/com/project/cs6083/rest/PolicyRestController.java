package com.project.cs6083.rest;

import com.project.cs6083.entity.Customer;
import com.project.cs6083.entity.InsurancePolicy;
import com.project.cs6083.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PolicyRestController {

    private CustomerService customerService;

    @Autowired
    public PolicyRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer/policy")
    public List<InsurancePolicy> getAllPolicy() {
        List<InsurancePolicy> policies = new ArrayList<>();

        List<Customer> customers = customerService.findAll();
        for(Customer customer : customers) {
            policies.addAll(customer.getInsurancePolicies());
        }

        return policies;
    }

    @GetMapping("/customer/{id}/policy/{policyNumber}")
    public InsurancePolicy getPolicyByPolicyNumber(@PathVariable int id, @PathVariable int policyNumber) {
        Optional<Customer> customerOptional = Optional.ofNullable(customerService.findById(id));
        if(!customerOptional.isPresent()) throw new RuntimeException("Customer with this id is not found in database");

        List<InsurancePolicy> insurancePolicies = customerOptional.get().getInsurancePolicies();
        for(InsurancePolicy policy : insurancePolicies) {
            if (policy.getPolicyNumber() == policyNumber) return policy;
        }

        throw new RuntimeException("No Policy Found For this customer");
    }

    @PostMapping("/customer/{id}/policy")
    public ResponseEntity<?> addNewPolicy(@RequestBody InsurancePolicy policy, @PathVariable int id) {
        Optional<Customer> customerOptional = Optional.ofNullable(customerService.findById(id));
        if (!customerOptional.isPresent()) return ResponseEntity.notFound().build();

        Customer customer = customerOptional.get();
        customer.addInsurancePolicy(policy);

        customer.setId(id);
        customerService.save(customer);

        return ResponseEntity.noContent().build();
    }

//    @PutMapping("/customer/{id}/policy")
//    public InsurancePolicy updatePolicy(@RequestBody InsurancePolicy policy, @PathVariable int id) {
//        Customer customer = customerService.findById(id);
//        List<InsurancePolicy> policies = customer.getInsurancePolicies();
//        int left = 0, right = policies.size();
//        while(left < right) {
//            int mid = left + (right - left) / 2;
//            if (policies.get(mid).getPolicyNumber() == policy.getPolicyNumber()) {
//                policies.remove(mid);
//                policies.add(mid - 1, policy);
//                break;
//            } else if (policies.get(mid).getPolicyNumber() < policy.getPolicyNumber()) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        customer
//        customer.setId(id);
//    }
}
