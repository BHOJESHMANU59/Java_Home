package com.springs;

public class Area {
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void findArea()
	{
		System.out.println("Area is calculated");
	}

	@Override
	public String toString() {
		return "Area [x=" + x + ", y=" + y + "]";
	}
	

}
