package com.Strings;

// Count Number of Words Present in given String without using length() method

public class CountNo_OfWords 
{
	public static void main(String[] args) {
		String s="12 32 12";
		int c=1;
		int l=0;
		for(char ch:s.toCharArray())
		{
			l++;
			if(ch==' ')
			{
				c++;
			}
		}
		if(l==0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(c);
		}
		
	}

}
