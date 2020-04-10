package com.chrisqin.cs6083employeeserver.service.home;

import com.chrisqin.cs6083employeeserver.dao.HomeInvoiceRepository;
import com.chrisqin.cs6083employeeserver.entity.home.HomeInvoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeInvoiceServiceImpl implements HomeInvoiceService{

    @Autowired
    private HomeInvoiceRepository homeInvoiceRepository;

    @Override
    public List<HomeInvoice> getHomeInvoiceByPolicyNum(int policyNum) {
        return homeInvoiceRepository.getInvoicesByPolicyNum(policyNum);
    }
}
