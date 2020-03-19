package com.project.cs6083.rest.auto;

import com.project.cs6083.entity.InsurancePolicy;
import com.project.cs6083.entity.auto.AutoUnderPolicy;
import com.project.cs6083.entity.auto.Driver;
import com.project.cs6083.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer/{id}/policy/{policyNumber}/auto/{autoId}")
@CrossOrigin
public class DriverController {

    private CustomerService customerService;

    @Autowired
    public DriverController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/driver")
    public List<Driver> getAllDrivers(@PathVariable int id, @PathVariable int policyNumber, @PathVariable int autoId) {
        for(InsurancePolicy policy : customerService.findById(id).getInsurancePolicies()) {
            if (policy.getPolicyNumber() != policyNumber) continue;
            else {
                for(AutoUnderPolicy auto : policy.getAutoPolicy().getAutoUnderPolicy()) {
                    if (auto.getAutoId() != autoId) continue;
                     else {
                         return auto.getDriver();
                    }
                }
            }
        }

        throw new RuntimeException("No driver assigned to this vehicle");
    }
}
