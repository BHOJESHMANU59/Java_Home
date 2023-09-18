package com.sy;

public class Car implements Vehicle{

	private Speed speed;
	
	
	public Speed getSpeed() {
		return speed;
	}


	public void setSpeed(Speed speed) {
		this.speed = speed;
	}


	public void findTopSpeed()
	{
		System.out.println("The top Speed of the Car is : "+speed.getTopSpeed());
	}
	

}
