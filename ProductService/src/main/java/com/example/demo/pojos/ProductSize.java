package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productSizeValue")
public class ProductSize {
	
	private int product_size_id;
	
	private ProductService sizeId;
	
	private String sizeValue;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getProduct_size_id() {
		return product_size_id;
	}
	public void setProduct_size_id(int product_size_id) {
		this.product_size_id = product_size_id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sizeId")
	public ProductService getSizeId() {
		return sizeId;
	}
	public void setSizeId(ProductService sizeId) {
		this.sizeId = sizeId;
	}
	public String getSizeValue() {
		return sizeValue;
	}
	public void setSizeValue(String sizeValue) {
		this.sizeValue = sizeValue;
	}

	
	

}
