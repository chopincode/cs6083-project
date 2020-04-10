package com.chrisqin.cs6083employeeserver.service.home;

import com.chrisqin.cs6083employeeserver.entity.home.Home;

import java.util.List;

public interface HomeService {

    List<Home> getHomeByPolicyNum(int policyNum);
}
