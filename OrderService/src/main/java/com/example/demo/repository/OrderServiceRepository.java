package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.OrderService;

public interface OrderServiceRepository extends JpaRepository<OrderService, Integer> {

	
	
}
