package com.Strings;

// Reverse The Given String

public class ReverseString 
{
	public static String reverse(String str)
	{
		System.out.println(str);
		
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		
		return s;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(reverse("AbcdE"));
	}

}
