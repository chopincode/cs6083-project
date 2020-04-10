package com.chrisqin.cs6083employeeserver.entity.home;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "home_id")
    private int homeId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "purchase_value")
    private double purchaseValue;

    @Column(name = "home_area")
    private double homeArea;

    @Column(name = "auto_fire")
    private int autoFire;

    @Column(name = "home_security")
    private int homeSecurity;

    @Column(name = "pool")
    private String pool;

    @Column(name = "basement")
    private String basement;

    @Column(name = "policy_num")
    private int policyNum;

    public Home() {
    }

    public Home(Date purchaseDate, double purchaseValue, double homeArea, int autoFire, int homeSecurity, String pool, String basement) {
        this.purchaseDate = purchaseDate;
        this.purchaseValue = purchaseValue;
        this.homeArea = homeArea;
        this.autoFire = autoFire;
        this.homeSecurity = homeSecurity;
        this.pool = pool;
        this.basement = basement;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public double getHomeArea() {
        return homeArea;
    }

    public void setHomeArea(double homeArea) {
        this.homeArea = homeArea;
    }

    public int getAutoFire() {
        return autoFire;
    }

    public void setAutoFire(int autoFire) {
        this.autoFire = autoFire;
    }

    public int getHomeSecurity() {
        return homeSecurity;
    }

    public void setHomeSecurity(int homeSecurity) {
        this.homeSecurity = homeSecurity;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(int policyNum) {
        this.policyNum = policyNum;
    }
}
