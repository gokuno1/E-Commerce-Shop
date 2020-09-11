package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productSizeValue")
public class ProductSize {
	
	@Id
	private int sizeId;
	
	private String sizeName;

	
	
	public ProductSize() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getSizeId() {
		return sizeId;
	}



	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}



	public String getSizeName() {
		return sizeName;
	}



	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}
	
	

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name = "sizeId") public int getSizeId() { return sizeId; }
	 * 
	 * public void setSizeId(int sizeId) { this.sizeId = sizeId; }
	 * 
	 * public String getSizeName() { return sizeName; }
	 * 
	 * public void setSizeName(String sizeName) { this.sizeName = sizeName; }
	 */
	
	
	

}
