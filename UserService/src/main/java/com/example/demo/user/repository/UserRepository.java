package com.example.demo.user.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.user.model.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Integer>{
	
	@Query(value="select u from UserInfo u where u.email_id=:email_id")
	public UserInfo findByEmail(@Param("email_id") String email);

}
