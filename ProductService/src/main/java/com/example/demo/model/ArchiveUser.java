package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class ArchiveUser {

	private String password;

	private String userName;

	@Id
	private Long userId;

	private String sapCode;

	private String email;

	@Column(name = "ENABLED")
	private Boolean enabled;

	@Column(name = "ACCOUNT_LOCKED")
	private Boolean accountNonLocked;

	@Column(name = "ACCOUNT_EXPIRED")
	private Boolean accountNonExpired;

	@Column(name = "CREDENTIALS_EXPIRED")
	private Boolean credentialsNonExpired;

	@Column(name = "POPUPFLAG")
	private Boolean popUpFlag;

	private String deviceId;

	private String firstName;

	private String LastName;

	private String locationCode;

	private String fcmWebToken;
	private String fcmIosToken;
	private String fcmAndroidToken;

	private String ubsValue;

	private Boolean isParent;

	private byte[] image;

	private String homeAddress1;
	private String homeAddress2;
	private String homeAddress3;
	private String homeAddressPin;

	private String workAddress1;
	private String workAddress2;
	private String workAddress3;
	private String workAddressPin;

	private String companyName;

	private String userType;
	
	//added default language 
	private String defaultLanguage;

	private Date archived_date;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(Boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public Boolean getAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(Boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public Boolean getCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public Boolean getPopUpFlag() {
		return popUpFlag;
	}

	public void setPopUpFlag(Boolean popUpFlag) {
		this.popUpFlag = popUpFlag;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
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

	public String getFcmWebToken() {
		return fcmWebToken;
	}

	public void setFcmWebToken(String fcmWebToken) {
		this.fcmWebToken = fcmWebToken;
	}

	public String getFcmIosToken() {
		return fcmIosToken;
	}

	public void setFcmIosToken(String fcmIosToken) {
		this.fcmIosToken = fcmIosToken;
	}

	public String getFcmAndroidToken() {
		return fcmAndroidToken;
	}

	public void setFcmAndroidToken(String fcmAndroidToken) {
		this.fcmAndroidToken = fcmAndroidToken;
	}

	public String getUbsValue() {
		return ubsValue;
	}

	public void setUbsValue(String ubsValue) {
		this.ubsValue = ubsValue;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getHomeAddress1() {
		return homeAddress1;
	}

	public void setHomeAddress1(String homeAddress1) {
		this.homeAddress1 = homeAddress1;
	}

	public String getHomeAddress2() {
		return homeAddress2;
	}

	public void setHomeAddress2(String homeAddress2) {
		this.homeAddress2 = homeAddress2;
	}

	public String getHomeAddress3() {
		return homeAddress3;
	}

	public void setHomeAddress3(String homeAddress3) {
		this.homeAddress3 = homeAddress3;
	}

	public String getHomeAddressPin() {
		return homeAddressPin;
	}

	public void setHomeAddressPin(String homeAddressPin) {
		this.homeAddressPin = homeAddressPin;
	}

	public String getWorkAddress1() {
		return workAddress1;
	}

	public void setWorkAddress1(String workAddress1) {
		this.workAddress1 = workAddress1;
	}

	public String getWorkAddress2() {
		return workAddress2;
	}

	public void setWorkAddress2(String workAddress2) {
		this.workAddress2 = workAddress2;
	}

	public String getWorkAddress3() {
		return workAddress3;
	}

	public void setWorkAddress3(String workAddress3) {
		this.workAddress3 = workAddress3;
	}

	public String getWorkAddressPin() {
		return workAddressPin;
	}

	public void setWorkAddressPin(String workAddressPin) {
		this.workAddressPin = workAddressPin;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public Date getArchived_date() {
		return archived_date;
	}

	public void setArchived_date(Date archived_date) {
		this.archived_date = archived_date;
	}
	
	
}
