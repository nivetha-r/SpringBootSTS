package com.loan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login")

public class Login implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid; 
	
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
	public Login(String username, String password, int userid) {
		super();
		this.username = username;
		this.password = password;
	     this.userid = userid;
	}
	
	

}
