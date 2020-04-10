package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.AutoInvoice;

import java.util.List;

public interface AutoInvoiceService {

    List<AutoInvoice> getAutoInvoiceByPolicyNum(int policyNum);
}
