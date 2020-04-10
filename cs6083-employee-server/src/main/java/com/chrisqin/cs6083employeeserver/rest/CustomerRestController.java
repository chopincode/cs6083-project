package com.chrisqin.cs6083employeeserver.rest;

import com.chrisqin.cs6083employeeserver.entity.Customer;
import com.chrisqin.cs6083employeeserver.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

//    @GetMapping("/customer")
//    public List<Customer> getAllCustomers() {
//        return customerService.findAll();
//    }

    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @PostMapping("/customer")
    public Customer postNewCustomer(@RequestBody Customer customer) {
        customer.setId(0);
        customerService.save(customer);
        return customer;
    }
}

