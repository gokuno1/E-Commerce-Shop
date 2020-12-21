package com.example.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SapcodeMappingModel {

	@Id
	@Column(name = "sapcode")
	private String sapCode;

	@Column(name = "mobileno")
	private String mobileno;

	@Column(name = "CREATED_DATE")
	private Timestamp createdDate;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String LastName;

	@Column(name = "LOCATION")
	private String locationCode;

	@Column(name = "UBS_VALUE")
	private String ubsValue;

	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "MEMBER_STATUS")
	private String memberStatus;
	
	@Column(name = "OU_CG")
	private String ouCG;

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getUbsValue() {
		return ubsValue;
	}

	public void setUbsValue(String ubsValue) {
		this.ubsValue = ubsValue;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getOuCG() {
		return ouCG;
	}

	public void setOuCG(String ouCG) {
		this.ouCG = ouCG;
	}
	
	
}
