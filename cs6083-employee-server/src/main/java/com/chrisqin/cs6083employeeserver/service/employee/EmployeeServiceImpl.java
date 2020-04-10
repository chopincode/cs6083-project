package com.chrisqin.cs6083employeeserver.service.employee;

import com.chrisqin.cs6083employeeserver.dao.EmployeeRepository;
import com.chrisqin.cs6083employeeserver.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public boolean login(String corporateId, String password) {
        if (employeeRepository.loginWithCorporateId(corporateId, password).size() == 0) return false;
        return true;
    }

    @Override
    public List<Employee> getInfoAfterLogin(String corporateId) {
        return employeeRepository.getInfoAfterLogin(corporateId);
    }
}
