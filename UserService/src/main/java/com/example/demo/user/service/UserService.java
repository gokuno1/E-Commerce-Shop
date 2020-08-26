package com.example.demo.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.user.model.UserInfo;
import com.example.demo.user.model.UserLoginResponse;

public interface UserService {

	public UserInfo addNewUser(UserInfo userinfo);
	public UserLoginResponse login(UserInfo userinfo,HttpServletRequest request, HttpServletResponse response);
	public UserLoginResponse authenticateUser(UserInfo userinfo, HttpServletRequest request, HttpServletResponse response);

}
