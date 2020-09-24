package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productInfo")
public class ProductService {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(name = "productName")
	private String productName;
	
	/*
	 * @Column(name = "categoryId") private ProductCategory categoryId;
	 */
	/*
	 * @OneToOne(targetEntity=ProductCategory.class,cascade=CascadeType.ALL)
	 * it is working use better logic ;)
	 * @JoinColumn(name="category_id",referencedColumnName="categoryId")
	 */
	private int categoryId;
	
	@Column(name = "productPrice")
	private double productPrice;
	
	/*
	 * @Column(name = "sizeId") private ProductSize sizeId;
	 */
	/*
	 * @OneToOne(targetEntity=ProductSize.class,cascade=CascadeType.ALL)
	 * it works use better logic:)
	 * @JoinColumn(name="size_id",referencedColumnName="sizeId")
	 */
	private int sizeId;
		
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

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "categoryId") public ProductCategory getCategoryId() {
	 * return categoryId; }
	 * 
	 * public void setCategoryId(ProductCategory categoryId) { this.categoryId =
	 * categoryId; }
	 */
	

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "sizeId") public ProductSize getSizeId() { return sizeId;
	 * }
	 * 
	 * public void setSizeId(ProductSize sizeId) { this.sizeId = sizeId; }
	 */
	
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}
	
	
	
	
}
