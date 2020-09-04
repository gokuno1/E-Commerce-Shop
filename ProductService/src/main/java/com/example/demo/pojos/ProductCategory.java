package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class ProductCategory {
	
	private ProductService categoryId;
	private String productCategory;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="productCategory")
	public ProductService getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(ProductService categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	

}
