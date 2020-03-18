package com.yizheqinxinghuawang.cs6083project.entity.home;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "home_payment")
public class HomePayment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_number")
	private int transactionNumber;

	@Column(name = "payment_date")
	private Date paymentDate;

	@Column(name = "method_of_payment")
	private String methodOfPayment;

	@OneToOne(mappedBy = "homeInstallmentPayment", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH })
	private HomeInvoice homeInvoice;

	public HomePayment() {
	}

	public HomePayment(Date paymentDate, String methodOfPayment) {
		this.paymentDate = paymentDate;
		this.methodOfPayment = methodOfPayment;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

}
