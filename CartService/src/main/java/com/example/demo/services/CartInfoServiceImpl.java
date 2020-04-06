package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.CartService;
import com.example.demo.repository.CartRepository;

@Service
public class CartInfoServiceImpl implements CartInfoServices {

	@Autowired
	CartRepository repository;
	
	@Override
	public boolean addToCart(CartService cart) {
		// TODO Auto-generated method stub
		if(repository.save(cart)!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public void deleteFromCart(int cartid) {
		// TODO Auto-generated method stub
		repository.deleteById(cartid);
		
	}

	@Override
	public CartService getById(int cartid) {
		// TODO Auto-generated method stub
		Optional<CartService> temp = repository.findById(cartid);
		return temp.get();
	}

}
