package com.chrisqin.cs6083employeeserver.entity;

import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "corporate_id")
    private String corporateId;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Customer> customers;

    public Employee() {
    }


    public Employee(String firstName, String lastName, String corporateId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.corporateId = corporateId;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(String corporateId) {
        this.corporateId = corporateId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    private void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customer.setEmployee(this);
        this.customers.add(customer);
    }
}
