package com.manytoone;

public class Car 
{
	private String carNo;
	private String carName;
	private double price;
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carName=" + carName + ", price=" + price + "]";
	}

	
}
