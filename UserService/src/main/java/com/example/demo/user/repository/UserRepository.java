package com.example.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.user.model.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer>{

}
