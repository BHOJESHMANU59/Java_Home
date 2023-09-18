package com.Strings;

public class StringPalindrome 
{
	public static String palindrome(String s) // Logic 1
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			return "Palindrome";
		}
		return "Not Palindrome";
	}
	
	// Another Way to Check Palindrome or Not
	
	public static void palindromeOrNot(String str) // Logic 2
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		if(rev.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(palindrome("radar"));
		palindromeOrNot("eye");
	
	}

}
