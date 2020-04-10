package com.chrisqin.cs6083employeeserver.service.customer;

import com.chrisqin.cs6083employeeserver.entity.Customer;


import java.util.List;


public interface CustomerService {

    public List<Customer> findAll();

    public Customer findById(int id);

    public Customer save(Customer customer);
}
