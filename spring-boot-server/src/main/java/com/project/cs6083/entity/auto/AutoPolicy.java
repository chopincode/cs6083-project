package com.project.cs6083.entity.auto;

import com.project.cs6083.entity.InsurancePolicy;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "auto_policy")
public class AutoPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_number")
    private int policyNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_number")
    private InsurancePolicy insurancePolicy;

    @OneToMany(mappedBy = "autoPolicy", cascade = CascadeType.ALL)
    private List<AutoUnderPolicy> autoUnderPolicy;

    public AutoPolicy() {}

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public List<AutoUnderPolicy> getAutoUnderPolicy() {
        return autoUnderPolicy;
    }


    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    private void setAutoUnderPolicy(List<AutoUnderPolicy> autoUnderPolicy) {
        this.autoUnderPolicy = autoUnderPolicy;
    }

    private void addNewAutoUnderPolicy(AutoUnderPolicy auto) {
    }

    public void addNewAuto(AutoUnderPolicy auto) {
        auto.setAutoPolicy(this);
        this.autoUnderPolicy.add(auto);
    }
}
