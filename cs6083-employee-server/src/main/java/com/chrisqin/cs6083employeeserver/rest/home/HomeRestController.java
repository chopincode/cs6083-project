package com.chrisqin.cs6083employeeserver.rest.home;

import com.chrisqin.cs6083employeeserver.entity.home.Home;
import com.chrisqin.cs6083employeeserver.service.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeRestController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home/{policyNum}")
    public List<Home> getHomeByPolicyNum(@PathVariable int policyNum) {
        return homeService.getHomeByPolicyNum(policyNum);
    }
}
