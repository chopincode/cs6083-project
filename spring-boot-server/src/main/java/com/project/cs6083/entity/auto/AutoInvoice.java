package com.project.cs6083.rest.auto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="auto_invoice")
public class AutoInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="invoice_number")
    private int invoiceNumber;

    @Column(name="invoice_amount")
    private double invoiceAmount;

    @Column(name="payment_due_date")
    private Date paymentDueDate;

    public AutoInvoice () {}

    public AutoInvoice(double invoiceAmount, Date paymentDueDate) {
        this.invoiceAmount = invoiceAmount;
        this.paymentDueDate = paymentDueDate;
    }


}
