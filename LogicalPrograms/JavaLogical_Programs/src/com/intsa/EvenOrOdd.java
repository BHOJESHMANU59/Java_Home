package com.intsa;

public class EvenOrOdd 
{
	public static void main(String[] args) {
		int n=15;
		if((n/2)*2==n)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println("-----------------");
		if((n>>1)<<1==n)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println("-------------------");
		if((n&1)==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
