package com.project.cs6083.rest;

import com.project.cs6083.entity.Customer;
import com.project.cs6083.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    private CustomerService customerService;

    @Autowired
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.findById(id);
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        customer.setId(0);
        customerService.save(customer);
        return customer;
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
        Optional<Customer> customerOptional = Optional.ofNullable(customerService.findById(id));

        if (!customerOptional.isPresent()) return ResponseEntity.notFound().build();

        customer.setId(id);
        customerService.save(customer);
        return ResponseEntity.noContent().build();

    }
}
