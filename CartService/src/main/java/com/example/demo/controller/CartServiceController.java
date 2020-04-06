package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProductProxy;
import com.example.demo.pojos.CartService;
import com.example.demo.services.CartInfoServiceImpl;

@RestController
public class CartServiceController {

	@Autowired
	ProductProxy proxy;
	
	@Autowired
	CartInfoServiceImpl service;
	
	@GetMapping("/cartservice/addtocart/{id}")
	public void addToCart(@PathVariable int id)
	{
		CartService response = proxy.getProductById(id);
		CartService addcart = new CartService(response.getCartId(), id , response.getProductName() ,response.getProductPrice(), response.getProductQuantity(), response.getGender(), response.getProductImages(), response.getProductSize());
		service.addToCart(addcart);
	}
	
	@DeleteMapping("/cartservice/delete/{cartid}")
	public void deleteFromCart(@PathVariable int cartid)
	{
		service.deleteFromCart(cartid);
	}
	
	@GetMapping("/cartservice/getbyid/{cartid}")
	public CartService getById(@PathVariable int cartid)
	{
		return service.getById(cartid);
	}
}
