package com.example.demo.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;
	private String email_id;
	private String first_Name;
	private String last_Name;
	private double mobile_no;
	private String password;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(int user_id, String email_id, String first_Name, String last_Name, double mobile_no) {
		super();
		this.user_id = user_id;
		this.email_id = email_id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.mobile_no = mobile_no;
	}



	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public double getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(double mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
