package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.entity.auto.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getDriverByAutoId(int id);
}
