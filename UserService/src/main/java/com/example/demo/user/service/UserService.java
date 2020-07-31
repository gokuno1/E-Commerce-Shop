package com.example.demo.user.service;

import com.example.demo.user.model.UserInfo;

public interface UserService {

	public UserInfo addNewUser(UserInfo userinfo);
	public UserInfo login(UserInfo userinfo);

}
