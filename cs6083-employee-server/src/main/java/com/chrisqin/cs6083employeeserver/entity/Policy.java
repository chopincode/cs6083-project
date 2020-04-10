package com.chrisqin.cs6083employeeserver.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private int id;

    @Column(name = "policy_num")
    private int policyNum;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "premium")
    private double premium;

    @Column(name = "cur_status")
    private String curStatus;

    @Column(name = "insur_type")
    private String insurType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;



    public Policy() {
    }

    public Policy(int policyNum, Date startDate, Date endDate, double premium, String curStatus, String insurType) {
        this.policyNum = policyNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.premium = premium;
        this.curStatus = curStatus;
        this.insurType = insurType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(int policyNum) {
        this.policyNum = policyNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public String getCurStatus() {
        return curStatus;
    }

    public void setCurStatus(String curStatus) {
        this.curStatus = curStatus;
    }

    public String getInsurType() {
        return insurType;
    }

    public void setInsurType(String insurType) {
        this.insurType = insurType;
    }


}
