package com.project.cs6083.entity;

import com.project.cs6083.entity.auto.AutoPolicy;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "insurance_policy")
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_number")
    private int policyNumber;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "premium_amount")
    private double premiumAmount;

    @Column(name = "insurance_status")
    private String insuranceStatus;

    @Column(name = "insurance_type")
    private String insuranceType;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Customer customer;

    @OneToOne(mappedBy = "insurancePolicy", cascade = CascadeType.ALL)
    private AutoPolicy autoPolicy;

    public InsurancePolicy() {
    }

    public InsurancePolicy(Date startDate, Date endDate, double premiumAmount, String insuranceStatus, String insuranceType) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.premiumAmount = premiumAmount;
        this.insuranceStatus = insuranceStatus;
        this.insuranceType = insuranceType;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
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

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AutoPolicy getAutoPolicy() {
        return autoPolicy;
    }

    private void setAutoPolicy(AutoPolicy autoPolicy) {
        this.autoPolicy = autoPolicy;
    }

    public void setCurAutoPolicy(AutoPolicy autoPolicy) {
        autoPolicy.setInsurancePolicy(this);
    }
}
