package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProductProxy;
import com.example.demo.model.CartService;
import com.example.demo.repository.CartRepository;
import com.example.demo.services.CartInfoServiceImpl;
import com.example.demo.utils.ResponseUtils;

@RestController
public class CartServiceController {

	 @Autowired 
	 CartRepository repo;
	 

	@Autowired
	ProductProxy proxy;
	
	@Autowired
	CartInfoServiceImpl service;
	
	@PostMapping("/cartservice/addtocart")
	public ResponseEntity<CartService> addToCart(@RequestBody CartService cartData)
	{
		ResponseEntity<CartService> resp = null;
		CartService cart = service.addToCart(cartData);
		if(cart!=null)
		{
			resp=ResponseUtils.getOKResponse(cart);
			return resp;
		}
		else
		{
			resp=ResponseUtils.getBadRequestResponse(cart);
			return resp;
		}
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
