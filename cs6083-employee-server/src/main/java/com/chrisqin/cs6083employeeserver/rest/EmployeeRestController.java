package com.chrisqin.cs6083employeeserver.rest;

import com.chrisqin.cs6083employeeserver.entity.Employee;
import com.chrisqin.cs6083employeeserver.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee login(@RequestBody LoginBody loginBody) {
        boolean isLogin = employeeService.login(loginBody.corporateId, loginBody.password);
        if (!isLogin) {
            throw new RuntimeException("Invalid credential");
        }
        return employeeService.getInfoAfterLogin(loginBody.corporateId).get(0);
    }

}

class LoginBody {
    String corporateId;
    String password;

    public LoginBody(String corporateId, String password) {
        this.corporateId = corporateId;
        this.password = password;
    }
}