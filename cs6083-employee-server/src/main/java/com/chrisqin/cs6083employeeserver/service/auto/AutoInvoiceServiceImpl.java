package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.dao.AutoInvoiceRepository;
import com.chrisqin.cs6083employeeserver.entity.auto.AutoInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoInvoiceServiceImpl implements AutoInvoiceService{

    @Autowired
    private AutoInvoiceRepository autoInvoiceRepository;

    @Override
    public List<AutoInvoice> getAutoInvoiceByPolicyNum(int policyNum) {
        return autoInvoiceRepository.getInvoicesByPolicyNum(policyNum);
    }
}
