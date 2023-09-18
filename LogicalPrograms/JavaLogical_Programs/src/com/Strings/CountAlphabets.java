package com.Strings;

// Count Number of Alphabets Present in given String

public class CountAlphabets 
{
	public static void main(String[] args) {
		String s="Abcd123@ab";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
