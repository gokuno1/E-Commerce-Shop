package com.example.demo.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.user.model.UserInfo;
import com.example.demo.user.model.UserLoginResponse;
import com.example.demo.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public UserInfo addNewUser(UserInfo userinfo) {
		// TODO Auto-generated method stub
		if(userinfo != null)
		{
			repository.save(userinfo);
			return userinfo;
		}
		return null;
	}

	@Override
	public UserLoginResponse login(UserInfo userinfo,HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public UserLoginResponse authenticateUser(UserInfo userinfo, HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserLoginResponse userResponse = new UserLoginResponse();
		UserInfo user= repository.findByEmail(userinfo.getEmail_id());
		if(user.getEmail_id()==userinfo.getEmail_id() && user.getPassword()==userinfo.getPassword())
		{
			userResponse.setEmail(userinfo.getEmail_id());
			userResponse.setName(userinfo.getFirst_Name()+userinfo.getLast_Name());
			userResponse.setSessionId(request.getSession().getId());
			userResponse.setStatus(HttpStatus.OK.name());
			return userResponse;
		}
		return null;
	}

}
