package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.home.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HomeRepository extends JpaRepository<Home, Integer> {

    @Query("SELECT h FROM Home h WHERE policyNum = :policyNum")
    List<Home> getHomeByPolicyNum(@Param("policyNum") int policyNum);
}
