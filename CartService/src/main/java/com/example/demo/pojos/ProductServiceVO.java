package com.example.demo.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductServiceVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="productId", insertable = false, updatable = false)
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "productCategory")
	private String productCategory;
	
	@Column(name = "productPrice")
	private double productPrice;
	
	@Column(name = "productSize")
	private String productSize;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "productImages")
	private String productImages;
	
	public ProductServiceVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductServiceVO(int productId, String productName, String productCategory, double productPrice,
			String productSize, String gender, String productImages) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productSize = productSize;
		this.gender = gender;
		this.productImages = productImages;
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

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
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

	
	
	
	
}
