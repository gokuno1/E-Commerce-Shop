package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ProductProxy;
import com.example.demo.pojos.CartService;
import com.example.demo.pojos.ProductServiceVO;
import com.example.demo.repository.CartRepository;
import com.example.demo.services.CartInfoServiceImpl;

@RestController
public class CartServiceController {

	 @Autowired 
	 CartRepository repo;
	 

	@Autowired
	ProductProxy proxy;
	
	@Autowired
	CartInfoServiceImpl service;
	
	@GetMapping("/cartservice/addtocart/{id}")
	public void addToCart(@PathVariable int id)
	{
		ProductServiceVO response = proxy.getProductById(id);
		CartService cart = new CartService();
		if(service.getByproductId(id))
		{
			int quantity = cart.getProductQuantity()+1;
			ProductServiceVO product = new ProductServiceVO(id, response.getProductName(), response.getProductCategory(),
					response.getProductPrice(), response.getProductSize(), response.getGender(), response.getProductImages());
			CartService cartservice = new CartService(cart.getCartId(), id, quantity, product);
			service.addToCart(cartservice);
		}
		else
		{
			cart.setProductQuantity(cart.getProductQuantity()+1);
			ProductServiceVO product = new ProductServiceVO(id, response.getProductName(), response.getProductCategory(),
					response.getProductPrice(), response.getProductSize(), response.getGender(), response.getProductImages());
			CartService addcart = new CartService(cart.getCartId(), id , cart.getProductQuantity(), product);
			service.addToCart(addcart);
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
