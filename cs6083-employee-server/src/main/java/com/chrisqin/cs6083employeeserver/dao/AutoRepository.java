package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.auto.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Integer> {

    @Query("SELECT a from Auto a WHERE policyNum = :policyNum")
    List<Auto> getAllAutosByPolicyNum(@Param("policyNum") int policyNum);
}
