package com.mindtree.O2Store_Project.core.bean;
import java.io.Serializable;
public class Plant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int price;
	
	public Plant() {
		super();
	}
	public Plant(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Plant [name=" + name + ", price=" + price + "]";
	}
	
}
