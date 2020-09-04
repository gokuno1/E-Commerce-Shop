package com.example.demo.user.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.user.model.UserInfo;
import com.example.demo.user.model.UserLoginResponse;
import com.example.demo.user.model.UserProfile;

public interface UserService {

	public UserInfo addNewUser(UserInfo userinfo);

	public UserLoginResponse login(UserInfo userinfo/* ,HttpServletRequest request, HttpServletResponse response */);

	public UserLoginResponse authenticateUser(UserInfo userinfo/* , HttpServletRequest request, HttpServletResponse response */);
	
	public UserProfile viewProfile(String emailId);
	
	//public UserProfile getByMobileno(double mobileno);
	
	public UserInfo updateUserbyEmail(String email, UserInfo user);
	
	public UserInfo updateUserbyMobile(double mobileNo, UserInfo user);
	
	public UserInfo deleteUser(String email);
	
	public ResponseEntity<UserInfo> forgotPassword(UserLoginResponse userCredentials);
	
	//Can add OTP methods
}
