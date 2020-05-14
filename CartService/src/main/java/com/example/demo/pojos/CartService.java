package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cartservice")
public class CartService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productQuantity")
	private int productQuantity;
	
	@Embedded
	@JoinColumn(name = "productId", referencedColumnName = "productId", insertable = false, updatable = false)
	private ProductServiceVO productDetails;
	
	public CartService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CartService(int cartId, int productId, int productQuantity, ProductServiceVO productDetails) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.productQuantity = productQuantity;
		this.productDetails = productDetails;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public ProductServiceVO getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductServiceVO productDetails) {
		this.productDetails = productDetails;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
}