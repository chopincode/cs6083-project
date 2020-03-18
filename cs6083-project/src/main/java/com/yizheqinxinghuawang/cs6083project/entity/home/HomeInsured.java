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
import javax.persistence.Table;

@Entity
@Table(name = "home_insured")
public class HomeInsured {

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

	@Column(name = "type_of_home")
	private String typeOfHome;

	@Column(name = "auto_fire_notification")
	private int autoFireNotification;

	@Column(name = "home_security_system")
	private int homeSecuritySystem;

	@Column(name = "swimming_pool")
	private String swimmingPool;

	@Column(name = "basement")
	private int basement;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "policy_number")
	private HomeInsurance homeInsurance;

	public HomeInsured() {
	}

	public HomeInsured(Date purchaseDate, double purchaseValue, double homeArea, String typeOfHome,
			int autoFireNotification, int homeSecuritySystem, String swimmingPool, int basement) {
		this.purchaseDate = purchaseDate;
		this.purchaseValue = purchaseValue;
		this.homeArea = homeArea;
		this.typeOfHome = typeOfHome;
		this.autoFireNotification = autoFireNotification;
		this.homeSecuritySystem = homeSecuritySystem;
		this.swimmingPool = swimmingPool;
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

	public String getTypeOfHome() {
		return typeOfHome;
	}

	public void setTypeOfHome(String typeOfHome) {
		this.typeOfHome = typeOfHome;
	}

	public int getAutoFireNotification() {
		return autoFireNotification;
	}

	public void setAutoFireNotification(int autoFireNotification) {
		this.autoFireNotification = autoFireNotification;
	}

	public int getHomeSecuritySystem() {
		return homeSecuritySystem;
	}

	public void setHomeSecuritySystem(int homeSecuritySystem) {
		this.homeSecuritySystem = homeSecuritySystem;
	}

	public String getSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(String swimmingPool) {
		this.swimmingPool = swimmingPool;
	}

	public int getBasement() {
		return basement;
	}

	public void setBasement(int basement) {
		this.basement = basement;
	}

}
