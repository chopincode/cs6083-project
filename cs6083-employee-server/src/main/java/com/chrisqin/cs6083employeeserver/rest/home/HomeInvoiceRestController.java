package com.chrisqin.cs6083employeeserver.rest.home;

import com.chrisqin.cs6083employeeserver.entity.home.HomeInvoice;
import com.chrisqin.cs6083employeeserver.service.home.HomeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeInvoiceRestController {

    @Autowired
    private HomeInvoiceService homeInvoiceService;

    @GetMapping("/homeinvoice/{policyNum}")
    public List<HomeInvoice> getHomeInvoiceByPolicyNum(@PathVariable int policyNum) {
        return homeInvoiceService.getHomeInvoiceByPolicyNum(policyNum);
    }
}
