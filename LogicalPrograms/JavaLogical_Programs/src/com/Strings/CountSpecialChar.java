package com.Strings;

// Count the Special Character in a given String

public class CountSpecialChar 
{
	public static int count(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(((str.charAt(i)>=65 && str.charAt(i)<=90) ||
				(str.charAt(i)>=97 && str.charAt(i)<=122) ||
				(str.charAt(i)>=48 && str.charAt(i)<=57))==false)
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println(count("abc@#123"));
		System.out.println(count("ABC@123Xyz#&"));
		
	}

}
