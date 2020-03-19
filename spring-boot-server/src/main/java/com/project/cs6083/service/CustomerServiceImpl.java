package com.project.cs6083.service;

import com.project.cs6083.dao.CustomerRepository;
import com.project.cs6083.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl (CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

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
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer, int id) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }
}
