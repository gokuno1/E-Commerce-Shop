package com.example.demo.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ProductProxy;
import com.example.demo.model.CartService;
import com.example.demo.model.ProductData;
import com.example.demo.repository.CartRepository;

@Service
public class CartInfoServiceImpl implements CartInfoServices {

	@Autowired
	ProductProxy proxy;
	
	@Autowired
	CartRepository repository;
	
	@Override
	@Transactional
	public CartService addToCart(CartService cart) {
		// TODO Auto-generated method stub
		ProductData product = proxy.getProductById(cart.getProductId());
		if(getByproductId(cart.getProductId()))
		{
			int quantity = cart.getProductQuantity()+1;
			cart.setCartId(cart.getCartId());
			cart.setProductDetails(product);
			cart.setProductQuantity(quantity);
			repository.save(cart);
			return cart;
		}
		else
		{
			cart.setCartId(cart.getCartId());
			cart.setProductDetails(product);
			cart.setProductId(cart.getProductId());
			cart.setProductQuantity(cart.getProductQuantity());
			repository.save(cart);
			return cart;
		}
		
		
		
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
