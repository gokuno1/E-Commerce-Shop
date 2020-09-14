package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.comm.CartFeignContoller;
import com.example.demo.pojos.CartServiceVO;
import com.example.demo.pojos.OrderService;
import com.example.demo.repository.OrderServiceRepository;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

	/*
	 * @Autowired CartProxy proxy;
	 */
	
	@Autowired
	CartFeignContoller feignCart;
	
	@Autowired
	OrderServiceRepository repository;
	
	@Override
	public boolean placeOrder(int cartId) {
		// TODO Auto-generated method stub
		CartServiceVO response = feignCart.getById(cartId);
		double quantity=response.getProductQuantity()*response.getProductDetails().getProductPrice();
		OrderService placeorder = new OrderService();
		placeorder.setCartId(cartId);
		placeorder.setGender(response.getProductDetails().getGender());
		placeorder.setProductId(response.getProductId());
		placeorder.setProductImages(response.getProductDetails().getProductImages());
		placeorder.setProductName(response.getProductDetails().getProductName());
		placeorder.setProductPrice(response.getProductDetails().getProductPrice());
		placeorder.setProductQuantity(response.getProductQuantity());
		placeorder.setProductSize(response.getProductDetails().getProductSize());
		placeorder.setTotalPrice(quantity);
		placeorder.setStatus("Order Placed");
		if(repository.save(placeorder)!=null)
		{
			feignCart.deleteFromCart(cartId);
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

	@Override
	public OrderService updateOrder(int orderId, OrderService order) {
		// TODO Auto-generated method stub
		return null;
	}

}
