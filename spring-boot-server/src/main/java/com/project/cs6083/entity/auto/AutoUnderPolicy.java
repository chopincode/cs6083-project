package com.project.cs6083.entity.auto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "auto_under_policy")
public class AutoUnderPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    private int autoId;

    @Column(name = "VIN_number")
    private String VINnumber;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "auto_year")
    private String year;

    @Column(name = "auto_status")
    private String autoStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_number")
    private AutoPolicy autoPolicy;

    @OneToMany(mappedBy = "autoUnderPolicy", cascade = CascadeType.ALL)
    private List<Driver> driver;

    public AutoUnderPolicy() {
    }

    public AutoUnderPolicy(String VINnumber, String make, String model, String year, String autoStatus) {
        this.VINnumber = VINnumber;
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

    public String getVINnumber() {
        return VINnumber;
    }

    public void setVINnumber(String VINnumber) {
        this.VINnumber = VINnumber;
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

    public List<Driver> getDriver() {
        return driver;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }
}
