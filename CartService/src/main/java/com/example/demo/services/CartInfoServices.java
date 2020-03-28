package com.example.demo.services;

import com.example.demo.pojos.CartService;

public interface CartInfoServices {
	
	public boolean addToCart(CartService cart);
	public void deleteFromCart(int cartid);

}
