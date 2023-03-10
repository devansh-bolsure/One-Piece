package com.states;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop{
	
	@Id
	private int lid;
	private int price;
	private String brand;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	@Override
	public String toString() {
		return "Laptop [lid=" + lid +  ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	
}