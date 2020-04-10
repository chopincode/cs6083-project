package com.chrisqin.cs6083employeeserver.service.home;

import com.chrisqin.cs6083employeeserver.entity.home.HomeInvoice;

import java.util.List;

public interface HomeInvoiceService {

    List<HomeInvoice> getHomeInvoiceByPolicyNum(int policyNum);
}
