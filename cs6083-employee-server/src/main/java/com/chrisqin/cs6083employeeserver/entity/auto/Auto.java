package com.chrisqin.cs6083employeeserver.entity.auto;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    private int autoId;

    @Column(name = "vin")
    private String vin;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "auto_year")
    private String year;

    @Column(name = "auto_status")
    private String autoStatus;

    @Column(name="policy_num")
    private int policyNum;



    public Auto() {}

    public Auto(String vin, String make, String model, String year, String autoStatus) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.autoStatus = autoStatus;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAutoStatus() {
        return autoStatus;
    }

    public void setAutoStatus(String autoStatus) {
        this.autoStatus = autoStatus;
    }


}
