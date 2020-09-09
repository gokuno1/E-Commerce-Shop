package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productInfo")
public class ProductService {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "categoryId")
	private int categoryId;
	
	@Column(name = "productPrice")
	private double productPrice;
	
	@Column(name = "sizeId")
	private ProductService sizeId;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "productImages")
	private String productImages;
	
	public ProductService() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public ProductService getSizeId() {
		return sizeId;
	}

	public void setSizeId(ProductService sizeId) {
		this.sizeId = sizeId;
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
