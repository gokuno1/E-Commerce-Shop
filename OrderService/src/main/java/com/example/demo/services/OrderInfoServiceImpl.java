package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CartProxy;
import com.example.demo.pojos.OrderService;
import com.example.demo.repository.OrderServiceRepository;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

	@Autowired
	CartProxy proxy;
	
	@Autowired
	OrderServiceRepository repository;
	
	@Override
	public boolean placeOrder(OrderService order) {
		// TODO Auto-generated method stub
		OrderService response = proxy.getById(order.getCartId());
		double quantity=response.getProductQuantity()*response.getProductPrice();
		OrderService placeorder = new OrderService();
		placeorder.setCartId(order.getCartId());
		placeorder.setOrderId(order.getOrderId());
		placeorder.setGender(order.getGender());
		placeorder.setProductId(order.getProductId());
		placeorder.setProductImages(order.getProductImages());
		placeorder.setProductName(order.getProductName());
		placeorder.setProductPrice(order.getProductPrice());
		placeorder.setProductQuantity(order.getProductQuantity());
		placeorder.setProductSize(order.getProductSize());
		placeorder.setTotalPrice(quantity);
		if(repository.save(placeorder)!=null)
		{
			proxy.deleteFromCart(order.getCartId());
			return true;
		}
		return false;
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
