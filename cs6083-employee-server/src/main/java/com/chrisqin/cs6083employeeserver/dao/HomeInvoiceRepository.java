package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.home.HomeInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HomeInvoiceRepository extends JpaRepository<HomeInvoice, Integer> {

    @Query("SELECT i from HomeInvoice i WHERE policyNum = :policyNum")
    List<HomeInvoice> getInvoicesByPolicyNum(@Param("policyNum") int policyNum);
}
