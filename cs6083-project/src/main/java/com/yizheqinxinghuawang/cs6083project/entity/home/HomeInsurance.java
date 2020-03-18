package com.yizheqinxinghuawang.cs6083project.entity.home;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "home_insurance")
public class HomeInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policy_number")
	private int policyNumber;

	@Column(name = "insurance_status")
	private String insuranceStatus;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "premium_amount")
	private double premiumAmount;

	@OneToOne(mappedBy = "homeInsurance", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	private HomeCustomer homeCustomer;

	@OneToMany(mappedBy = "homeInsurance", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	List<HomeInsured> homesInsuredUnderPolicy;

	@OneToMany(mappedBy = "homeInsurance", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
			CascadeType.REFRESH })
	List<HomeInvoice> homeInvoices;

	public HomeInsurance() {
	}

	public HomeInsurance(String insuranceStatus, Date startDate, Date endDate, double premiumAmount) {
		this.insuranceStatus = insuranceStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.premiumAmount = premiumAmount;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getInsuranceStatus() {
		return insuranceStatus;
	}

	public void setInsuranceStatus(String insuranceStatus) {
		this.insuranceStatus = insuranceStatus;
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

	public List<HomeInsured> getHomesInsuredUnderPolicy() {
		return homesInsuredUnderPolicy;
	}

	public void setHomesInsuredUnderPolicy(List<HomeInsured> homesInsuredUnderPolicy) {
		this.homesInsuredUnderPolicy = homesInsuredUnderPolicy;
	}

	public List<HomeInvoice> getHomeInvoices() {
		return homeInvoices;
	}

	public void setHomeInvoices(List<HomeInvoice> homeInvoices) {
		this.homeInvoices = homeInvoices;
	}

}
