package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.PaymentServiceImpl;

@RestController
public class PaymentController {

	@Autowired
	PaymentServiceImpl service;
	
	@GetMapping("/placeorder/{orderid}")
	public String placeOrder(@PathVariable int orderid) throws Exception
	{
		service.placeOrder(orderid);
		return "Successfully paid";
	}
	
}
