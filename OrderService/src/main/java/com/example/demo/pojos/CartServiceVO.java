package com.example.demo.pojos;

public class CartServiceVO {
	
    private int cartId;
	
	private int productId;

	private int productQuantity;
	
	private ProductDataVO productDetails;

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

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public ProductDataVO getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDataVO productDetails) {
		this.productDetails = productDetails;
	}
	
	
	
	

}
