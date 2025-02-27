package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "AccountInfo")
public class AccountInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "accountNumber")
	private int accountNumber;

	@Column(name = "accountName")
	@ApiModelProperty(dataType="String", notes="Full Name")
	private String accountName;
	
	@Column(name = "balance")
	@NotNull
	@PositiveOrZero(message="Amount must be greater than or equal to zero")
	@ApiModelProperty(dataType="double", notes="Balance")
	private double balance;
	
	@Column(name = "accountType")
	@ApiModelProperty(dataType="String", notes="Account Type")
	private String accountType;

	@Column(name = "emailId")
	@ApiModelProperty(dataType="String", notes="Email Id")
	private String emailId;

	@Column(name = "phoneNumber")
	@NotNull
	@ApiModelProperty(dataType="int", notes="Phone Number")
	private int phoneNumber;

	@Column(name = "panNumber")
	@NotNull
	@Size(min=10, max=10, message="Card Number must be of 10 characters")
	@ApiModelProperty(dataType="String", notes="Pan Card Number")
	private String panNumber;
	
	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountInfo(int accountNumber, String accountName, double balance, String accountType, String emailId,
			int phoneNumber, String panNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.accountType = accountType;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	
}
