package com.assignment1;

// If all the Side Of Triangle is Equal x=y=z the it is Equilateral triangle .

// If Any Of Two Side Of Triangle is Equal x=y or y=z or z=x then it is Isosceles Triangle.

// If none of its sides is equal the it is Scalene Triangle

public class TriangleEx 
{
	static void check(int x,int y,int z)
	{
		if(x==y && y==z)
		{
			System.out.println("Given Triangle is Equilateral");
		}
		else if(x==y || y==z || z==x)
		{
			System.out.println("Given Triangle is Isosceles");
		}
		else
		{
			System.out.println("Given Triangle is Scalene");
		}
	}
	public static void main(String[] args) {
		check(10,20,30);
		check(1,2,1);
		check(11,11,11);
	}

}
