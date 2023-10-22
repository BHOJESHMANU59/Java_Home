package com.Strings;


// Count Upper case , Lower Case, Numerics and Special Characters in a Given String

public class CountLPSchars 
{
	static void count(String s)
	{
		int Lc=0;
		int Uc=0;
		int Dc=0;
		int Sc=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				Uc++;
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				Lc++;
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				Dc++;
			}
			else
			{
				Sc++;
			}
		}
		System.out.println("UpperCase Char : "+Uc);
		System.out.println("LowerCase Char : "+Lc);
		System.out.println("Numerics Char : "+Dc);
		System.out.println("Special Char : "+Sc);
		
	}
	public static void main(String[] args) {
		count("abcA123@_137ACD");
	}

}
