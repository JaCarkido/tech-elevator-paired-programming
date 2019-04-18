package com.techelevator;

import java.math.BigDecimal;

public class ShoppingCartItem {
	
	private String name;
	private double price;
	private String imgName;
	private int quantity;
	private double totalPrice;
	
	public ShoppingCartItem() {
		
	}

	public ShoppingCartItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getImgName() {
		return imgName;
	}
	
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return quantity * totalPrice;
	}

	
}
