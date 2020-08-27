package com.example.demo.services;

import com.example.demo.pojos.OrderService;

public interface OrderInfoService {

	public boolean placeOrder(OrderService order);
	public OrderService getbyOrderId(int orderId);
	public void deletebyid(int orderid);
}
