package com.chrisqin.cs6083employeeserver.rest.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.Auto;
import com.chrisqin.cs6083employeeserver.service.auto.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AutoRestController {

    @Autowired
    private AutoService autoService;

    @GetMapping("/auto/{policyNum}")
    public List<Auto> getAllAutoUnderPolicyNum(@PathVariable int policyNum) {
        return autoService.getAllAutoUnderPolicyNum(policyNum);
    }
}
