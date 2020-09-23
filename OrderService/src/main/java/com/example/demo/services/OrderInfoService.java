package com.example.demo.services;

import com.example.demo.model.OrderService;

public interface OrderInfoService {

	public boolean placeOrder(int cartId);
	public OrderService getbyOrderId(int orderId);
	public void deletebyid(int orderid);
	public OrderService updateOrder(int orderId, OrderService order);
}
