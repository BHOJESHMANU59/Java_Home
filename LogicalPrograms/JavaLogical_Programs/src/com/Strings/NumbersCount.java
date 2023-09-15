package com.Strings;

// How Many Numbers Or Digits Present In Given String

public class NumbersCount {
	public static void main(String[] args) {
		String s="Abc12321@bc";
		int c=0;
		for (char ch : s.toCharArray()) 
		{
			if(ch>=48 && ch<=57)
			{
				c++;
			}
			
		}
		System.out.println(c);
		
	}

}
