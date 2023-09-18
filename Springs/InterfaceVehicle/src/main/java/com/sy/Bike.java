package com.sy;

public class Bike implements Vehicle {

	private Speed speed;
	
	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
	}

	@Override
	public void findTopSpeed() 
	{
		System.out.println("The top Speed of the Bike is : "+speed.getTopSpeed());
	}
	

}
