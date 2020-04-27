package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.OrderService;
import com.example.demo.repository.OrderServiceRepository;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

	@Autowired
	OrderServiceRepository repository;
	
	@Override
	public void placeOrder(OrderService order) {
		// TODO Auto-generated method stub
		repository.save(order);
	}

	@Override
	public OrderService getbyOrderId(int orderId) {
		// TODO Auto-generated method stub
		Optional<OrderService> temp = repository.findById(orderId);
		return temp.get();
	}

	@Override
	public void deletebyid(int orderid) {
		// TODO Auto-generated method stub
		repository.deleteById(orderid);
	}

}
