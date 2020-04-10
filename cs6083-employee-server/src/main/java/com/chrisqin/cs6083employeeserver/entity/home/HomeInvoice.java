package com.chrisqin.cs6083employeeserver.entity.home;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "home_invoice")
public class HomeInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "amount")
    private double amount;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "policy_num")
    private int policyNum;

    public HomeInvoice() {
    }

    public HomeInvoice(Date dueDate, double amount, String paymentMethod, Date paymentDate) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(int policyNum) {
        this.policyNum = policyNum;
    }
}
