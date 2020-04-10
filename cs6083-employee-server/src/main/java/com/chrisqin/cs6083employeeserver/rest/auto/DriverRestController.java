package com.chrisqin.cs6083employeeserver.rest.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.Driver;
import com.chrisqin.cs6083employeeserver.service.auto.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DriverRestController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/driver/{id}")
    public List<Driver> getDriverByAutoId(@PathVariable int id) {
        return driverService.getDriverByAutoId(id);
    }
}
