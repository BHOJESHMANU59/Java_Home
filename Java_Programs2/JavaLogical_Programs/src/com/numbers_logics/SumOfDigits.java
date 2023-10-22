package com.numbers_logics;

//Write a Java Program to Print Sum of Digits

public class SumOfDigits {
	public static int sumofDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumofDigits(123));
		System.out.println(sumofDigits(5890));
	}

}
