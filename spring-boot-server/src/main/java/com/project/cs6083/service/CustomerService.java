package com.project.cs6083.service;

import com.project.cs6083.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();

    public Customer findById(int id);

    public void save(Customer customer);

    public void update(Customer customer, int id);

    public void deleteById(int id);
}
