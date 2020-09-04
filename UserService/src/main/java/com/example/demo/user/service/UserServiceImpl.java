package com.example.demo.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.user.model.UserInfo;
import com.example.demo.user.model.UserLoginResponse;
import com.example.demo.user.model.UserProfile;
import com.example.demo.user.repository.UserRepository;
import com.example.demo.utils.BasicEncryption;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	BasicEncryption encrypt;
	
	@Autowired
	UserRepository repository;
	
	@Override
	public UserInfo addNewUser(UserInfo userinfo) {
		// TODO Auto-generated method stub
		UserInfo data = new UserInfo();
		if(userinfo != null)
		{
			data.setEmail_id(userinfo.getEmail_id());
			data.setFirst_Name(userinfo.getFirst_Name());
			data.setLast_Name(userinfo.getLast_Name());
			data.setMobile_no(userinfo.getMobile_no());
			String pwd = encrypt.encryptPlainText(userinfo.getPassword());
			data.setPassword(pwd);
			repository.save(data);
			return data;
		}
		return null;
	}

	@Override
	public UserLoginResponse login(UserInfo userinfo/* ,HttpServletRequest request, HttpServletResponse response */) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public UserLoginResponse authenticateUser(
			UserInfo userinfo/* , HttpServletRequest request, HttpServletResponse response */) {
		// TODO Auto-generated method stub
		System.out.println(userinfo);
		UserLoginResponse userResponse = new UserLoginResponse();
		UserInfo user= repository.findByEmail(userinfo.getEmail_id());
		System.out.println(user);
		if(userinfo.getEmail_id().equals(user.getEmail_id()) && userinfo.getPassword().equals(encrypt.decryptCipherText(user.getPassword())))
		{
			String session="12348575";
			userResponse.setEmail(userinfo.getEmail_id());
			userResponse.setName(userinfo.getFirst_Name());
			userResponse.setSessionId(session);
			userResponse.setStatus(HttpStatus.OK.name());
			System.out.println(userResponse);
			return userResponse;
		}
		return userResponse;
	}

	@Override
	public UserProfile viewProfile(String emailId) {
		// TODO Auto-generated method stub
		UserProfile profile = new UserProfile();
		UserInfo user = repository.findByEmail(emailId);
		if(user!=null)
		{
			profile.setFirst_Name(user.getFirst_Name());
			profile.setLast_Name(user.getLast_Name());
			profile.setEmail_id(user.getEmail_id());
			profile.setMobile_no(user.getMobile_no());
			profile.setUser_id(user.getUser_id());
			System.out.println(profile);
			return profile;
		}
		
		return null;
	}

	@Override
	public UserInfo updateUserbyEmail(String email, UserInfo user) {
		// TODO Auto-generated method stub
		UserInfo oldData = repository.findByEmail(email);
		user.setUser_id(oldData.getUser_id());
		UserInfo newData = repository.save(user);
		return newData;
	}

	@Override
	public UserInfo updateUserbyMobile(double mobileNo, UserInfo user) {
		// TODO Auto-generated method stub
		UserInfo oldData = repository.findByMobile(mobileNo);
		user.setUser_id(oldData.getUser_id());
		UserInfo newData = repository.save(user);
		return newData;
	}

	@Override
	public UserInfo deleteUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UserInfo> forgotPassword(UserLoginResponse userCredentials) {
		// TODO Auto-generated method stub
		return null;
	}

}
