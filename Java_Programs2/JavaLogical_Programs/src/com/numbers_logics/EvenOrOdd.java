package com.numbers_logics;

// Java Program to check if the given number is even or odd
//  1) without using modulus operator
//  2) Without Using if-else Statement

public class EvenOrOdd 
{
	public static String check(int n)      
	{
		if(n%2==0)                      // Using Modulus Operator
		{
			return "Even";
		}
		
		
		if((n/2)*2==n)                 // Without Using Modulus Operator
		{
			return "Even";
		}
		
		if((n>>1)<<1==n)              // Using Shift Operator
		{
			return "Even";
		}
		
		if((n&1)==0)              // Using Logical And Gate
		{
			return "Even";
		}
		                                    //Using Switch (Without Using If-else) 
		switch(n%2)
		{
		case 0: return "Even";
		case 1: return "Odd";
		}
		return "Odd";
		
	}
	
	public static void main(String[] args) {
		System.out.println(check(6));
		System.out.println(check(3));
		
	}

}
