package com.Strings;

// Java Program to Convert STring to Integer and Add two Strings and Multiply two Strings the Result Should be in Integer form

public class SumAndProOf_TwoStr
{
	public static void sumAndPro(String s1,String s2)
	{
		int sum=helper(s1)+helper(s2);
		int pro=helper(s1)*helper(s2);
		
		System.out.println("Sum of Two Strings : "+sum);
		System.out.println("Product of Two Strings : "+pro);
	}

	private static int helper(String s) 
	{
		int n=0;
		for(int i=0;i<s.length();i++)
		{
			n=n*10+(s.charAt(i)-48);
		}
		
		return n;
	}
	public static void main(String[] args) 
	{
		sumAndPro("10", "10");
		
	}

}
