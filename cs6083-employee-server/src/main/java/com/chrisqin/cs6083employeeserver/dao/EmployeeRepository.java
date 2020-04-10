package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE corporateId = :corporateId AND password = :password")
    List<Employee> loginWithCorporateId(@Param("corporateId") String corporateId, @Param("password") String password);

    @Query("SELECT e FROM Employee e WHERE corporateId = :corporateId")
    List<Employee> getInfoAfterLogin(@Param("corporateId") String corporateId);
}
