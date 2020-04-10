package com.chrisqin.cs6083employeeserver.service.employee;

import com.chrisqin.cs6083employeeserver.entity.Employee;

import java.util.List;

public interface EmployeeService {
    boolean login(String corporateId, String password);

    List<Employee> getInfoAfterLogin(String corporateId);

}
