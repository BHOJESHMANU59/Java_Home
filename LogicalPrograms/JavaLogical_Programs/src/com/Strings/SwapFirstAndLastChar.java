package com.Strings;

// Swap the First and Last Characters in given String

public class SwapFirstAndLastChar 
{
	public static void main(String[] args) {
		
		String s="abc";
		
		if(s.length()>2)
		{
			char first=s.charAt(0);
			char last=s.charAt(s.length()-1);
			String swap=last+s.substring(1, s.length()-1)+first;
			System.out.println(swap);
		}
		else
		{
			System.out.println(s);
		}
			
	}

}
