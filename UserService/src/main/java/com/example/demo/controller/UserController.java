package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.user.model.UserInfo;
import com.example.demo.user.model.UserLoginResponse;
import com.example.demo.user.service.UserServiceImpl;
import com.example.demo.utils.ResponseUtils;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl service;
	
	@PostMapping(value="/authenticateUser")
	public ResponseEntity<UserLoginResponse> authenticateUser(@RequestBody UserInfo user, HttpServletRequest request, HttpServletResponse response)
	{
		ResponseEntity<UserLoginResponse> resp = null;
		UserLoginResponse res = service.authenticateUser(user, request, response);
		if(res.getStatus()==HttpStatus.OK.name())
		{
			resp=ResponseUtils.getOKResponse(res);
			return resp;
		}
		else
		{
			resp=ResponseUtils.getUnAuthorizedResponse(res);
			return resp;
		}
		
	}
	
	@PostMapping(value="/addNewUser")
	public ResponseEntity<UserInfo> addNewUser(@RequestBody UserInfo user)
	{
		ResponseEntity<UserInfo> resp = null;
		UserInfo res = service.addNewUser(user);
		if(res!=null)
		{
			resp=ResponseUtils.getBadRequestResponse(res);
			return resp;
		}
		else
		{
			resp=ResponseUtils.getOKResponse(res);
			return resp;
		}
		
	}
	
}
