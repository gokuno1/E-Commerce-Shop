package com.example.demo.services;

import com.example.demo.pojos.CartService;

public interface CartInfoServices {
	
	public CartService addToCart(CartService cart);
	public void deleteFromCart(int cartid);
	public CartService getById(int cartid);
	public boolean getByproductId(int productid);
}
