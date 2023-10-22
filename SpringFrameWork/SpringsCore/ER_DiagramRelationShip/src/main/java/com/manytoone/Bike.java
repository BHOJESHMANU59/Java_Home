package com.manytoone;

public class Bike 
{
	private String bikeNo;
	private String bikeName;
	private double price;
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", bikeName=" + bikeName + ", price=" + price + "]";
	}

	
}
