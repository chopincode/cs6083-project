package com.chrisqin.cs6083employeeserver.service.auto;

import com.chrisqin.cs6083employeeserver.dao.DriverRepository;
import com.chrisqin.cs6083employeeserver.entity.auto.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> getDriverByAutoId(int id) {
        return driverRepository.getDriverByAutoId(id);
    }
}
