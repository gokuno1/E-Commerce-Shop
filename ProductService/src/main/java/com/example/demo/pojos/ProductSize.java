package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productSizeValue")
public class ProductSize {
	
	private ProductService sizeId;
	
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
	private String sizeValue;
	
	

}
