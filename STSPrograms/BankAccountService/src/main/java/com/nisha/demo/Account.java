package com.nisha.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private int userid;
	@Id
	private int accountnum;
	@Column
	private double amount;
	@Column
	private String accounttype;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Account [userid=" + userid + ", accountnum=" + accountnum + ", amount=" + amount + ", accounttype="
				+ accounttype + "]";
	}

	public Account(int userid, int accountnum, double amount, String accounttype) {
		super();
		this.userid = userid;
		this.accountnum = accountnum;
		this.amount = amount;
		this.accounttype = accounttype;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

}
