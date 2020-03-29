package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderService")
public class OrderService {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@Column(name= "cartId")
	private int cartId;
	
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "productPrice")
	private double productPrice;
	
	@Column(name = "productQuantity")
	private int productQuantity;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "productImages")
	private String productImages;
	
	@Column(name = "productSize")
	private String productSize;
	
	public OrderService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderService(int orderId, int cartId, int productId, String productName, double productPrice,
			int productQuantity, String gender, String productImages, String productSize) {
		super();
		this.orderId = orderId;
		this.cartId = cartId;
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.gender = gender;
		this.productImages = productImages;
		this.productSize = productSize;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getProductImages() {
		return productImages;
	}

	public void setProductImages(String productImages) {
		this.productImages = productImages;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

}
