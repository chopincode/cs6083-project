package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.Auto;

import java.util.List;

public interface AutoService {
    List<Auto> getAllAutoUnderPolicyNum(int policyNum);
}
