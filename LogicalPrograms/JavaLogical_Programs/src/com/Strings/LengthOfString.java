package com.Strings;

// Length of String Without Using InBuilt Function(length())

public class LengthOfString 
{
	public static void main(String[] args) {
		String s="Hello";
		int length=0;
		for (char ch : s.toCharArray()) 
		{
			length++;
			
		}
		System.out.println("String Length : "+length);
		
	}

}
