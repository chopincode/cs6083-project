package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.dao.AutoRepository;
import com.chrisqin.cs6083employeeserver.entity.auto.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoServiceImpl implements AutoService{

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public List<Auto> getAllAutoUnderPolicyNum(int policyNum) {
        return autoRepository.getAllAutosByPolicyNum(policyNum);
    }
}
