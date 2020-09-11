package com.example.demo.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class ProductCategory {
	
	@Id
	private int categoryId;
	
	private String categoryName;

	
	
	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	
	

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name = "categoryId") public int getCategoryId() { return categoryId;
	 * }
	 * 
	 * public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
	 * 
	 * public String getCategoryName() { return CategoryName; }
	 * 
	 * public void setCategoryName(String categoryName) { CategoryName =
	 * categoryName; }
	 */
	
	
	
	

}
