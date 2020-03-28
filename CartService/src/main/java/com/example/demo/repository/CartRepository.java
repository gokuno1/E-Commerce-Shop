package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.CartService;

@Repository
public interface CartRepository extends JpaRepository<CartService, Integer> {
	

}
