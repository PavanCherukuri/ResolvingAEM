package com.mindtree.O2Store_Project.core.bean;

public class Product {

	private String productName;
	private String productDisplayName;
	private int price;

	public Product() {
		super();
	}

	public Product(String productName, String productDisplayName, int price) {
		super();
		this.productName = productName;
		this.productDisplayName = productDisplayName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDisplayName() {
		return productDisplayName;
	}

	public void setProductDisplayName(String productDisplayName) {
		this.productDisplayName = productDisplayName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDisplayName=" + productDisplayName + ", price=" + price
				+ "]";
	}

}
