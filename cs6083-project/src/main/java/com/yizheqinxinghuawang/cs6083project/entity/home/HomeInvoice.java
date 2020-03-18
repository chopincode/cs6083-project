package com.yizheqinxinghuawang.cs6083project.entity.home;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "home_invoice")
public class HomeInvoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoice_number")
	private int invoiceNumber;

	@Column(name = "invoice_amount")
	private double invoiceAmount;

	@Column(name = "payment_due_date")
	private Date paymentDueDate;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "policy_number")
	private HomeInsurance homeInsurance;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "transaction_number")
	private HomePayment homeInstallmentPayment;

	public HomeInvoice() {
	}

	public HomeInvoice(double invoiceAmount, Date paymentDueDate) {
		this.invoiceAmount = invoiceAmount;
		this.paymentDueDate = paymentDueDate;
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public Date getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public HomePayment getHomePayment() {
		return homeInstallmentPayment;
	}

	public void setHomePayment(HomePayment homePayment) {
		this.homeInstallmentPayment = homePayment;
	}

}
