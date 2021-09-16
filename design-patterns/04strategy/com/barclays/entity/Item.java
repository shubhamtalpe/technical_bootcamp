package com.barclays.entity;

public class Item {
	private String itemName;
	private double price;
	private int count;
	
	
	public Item(String itemName, double price, int count) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.count = count;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}
	
	
}
