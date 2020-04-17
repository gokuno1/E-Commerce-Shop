package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paymentInfo")
public class PaymentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@Column(name = "orderId")
	private int orderId;
	
	@Column(name = "cartId")
	private int cartId;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "productImage")
	private String productImage;
		
	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PaymentModel(int paymentId, int orderId, int cartId, double price, String productImage) {
		super();
		this.paymentId = paymentId;
		this.orderId = orderId;
		this.cartId = cartId;
		this.price = price;
		this.productImage = productImage;
	}

	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
