package com.chrisqin.cs6083employeeserver.dao;


import com.chrisqin.cs6083employeeserver.entity.auto.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

    @Query("SELECT d from Driver d WHERE driverId = :driverId")
    List<Driver> getDriverByAutoId(@Param("driverId") int driverId);
}
