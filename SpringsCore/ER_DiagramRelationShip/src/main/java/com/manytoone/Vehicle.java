package com.manytoone;

import java.util.List;

public class Vehicle 
{
	private Car car;
	private List<Bike> bikes;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}
	@Override
	public String toString() {
		return "Vehicle [car=" + car + ", bikes=" + bikes + "]";
	}

	
}
