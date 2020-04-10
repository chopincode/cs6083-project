package com.chrisqin.cs6083employeeserver.dao;

import com.chrisqin.cs6083employeeserver.entity.auto.AutoInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutoInvoiceRepository extends JpaRepository<AutoInvoice, Integer> {

    @Query("SELECT i from AutoInvoice i WHERE policyNum = :policyNum")
    List<AutoInvoice> getInvoicesByPolicyNum(@Param("policyNum") int policyNum);
}
