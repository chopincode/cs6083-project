package com.chrisqin.cs6083employeeserver.service.customer;

import com.chrisqin.cs6083employeeserver.dao.CustomerRepository;
import com.chrisqin.cs6083employeeserver.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> result = customerRepository.findById(id);

        Customer customer = null;

        if (result.isPresent()) {
            customer = result.get();
        } else {
            throw new RuntimeException("Did not find Customer id " + id);
        }

        return customer;
    }


    @Override
    public Customer save(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }
}
