package com.example.demo.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojos.CartService;
import com.example.demo.repository.CartRepository;

@Service
public class CartInfoServiceImpl implements CartInfoServices {

	@Autowired
	CartRepository repository;
	
	@Override
	@Transactional
	public boolean addToCart(CartService cart) {
		// TODO Auto-generated method stub
		
		 CartService temp = repository.getbyproductId(cart.getProductId());
		 if(temp!=null)
		 { 
			 repository.updateCount(cart.getProductId()); 
		 } 
		 else 
		 {
			 if(repository.save(cart)!=null) 
			 { 
				 return true; 
		     } 
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

	@Override
	public boolean getByproductId(int productid) {
		// TODO Auto-generated method stub
		CartService temp = repository.getbyproductId(productid);
		if(temp!=null)
		{
			return true;
		}
		return false;
	}

	


}
