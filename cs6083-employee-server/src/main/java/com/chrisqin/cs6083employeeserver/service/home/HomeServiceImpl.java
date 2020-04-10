package com.chrisqin.cs6083employeeserver.service.home;

import com.chrisqin.cs6083employeeserver.dao.HomeRepository;
import com.chrisqin.cs6083employeeserver.entity.home.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService{

    @Autowired
    private HomeRepository homeRepository;

    @Override
    public List<Home> getHomeByPolicyNum(int policyNum) {
        return homeRepository.getHomeByPolicyNum(policyNum);
    }
}
