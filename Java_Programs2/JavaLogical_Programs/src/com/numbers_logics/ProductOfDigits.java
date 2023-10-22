package com.numbers_logics;

//Write a Java Program to Print Product of Digits

public class ProductOfDigits {
	public static int productofDigits(int n)
	{
		int pro=1;
		while(n>0)
		{
			int rem=n%10;
			pro=pro*rem;
			n=n/10;
		}
		return pro;
	}
	public static void main(String[] args) {
		System.out.println(productofDigits(123));
	}

}
