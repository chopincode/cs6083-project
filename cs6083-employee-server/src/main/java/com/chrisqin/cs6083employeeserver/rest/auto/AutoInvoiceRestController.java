package com.chrisqin.cs6083employeeserver.rest.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.AutoInvoice;
import com.chrisqin.cs6083employeeserver.service.auto.AutoInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AutoInvoiceRestController {

    @Autowired
    private AutoInvoiceService autoInvoiceService;

    @GetMapping("/autoinvoice/{policyNum}")
    public List<AutoInvoice> getAutoInvoices(@PathVariable int policyNum) {
        return autoInvoiceService.getAutoInvoiceByPolicyNum(policyNum);
    }
}
