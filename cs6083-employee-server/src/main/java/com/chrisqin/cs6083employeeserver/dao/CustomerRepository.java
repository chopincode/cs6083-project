package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
