package com.Strings;

// Java Program for Sum Of Numeric String Elements

public class NumericSumOfString
{
	public static void main(String[] args) {
		String s="1234";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			sum=sum+(s.charAt(i)-48);
		}
		System.out.println(sum);
	}

}
