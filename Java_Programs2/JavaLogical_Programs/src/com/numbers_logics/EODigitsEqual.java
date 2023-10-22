package com.numbers_logics;

// Return True if the Given Number Having Same number of Even Digits and Odd Digits

public class EODigitsEqual {
	public static boolean check(int n)
	{
		int e=0;
		int o=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}
			n/=10;
		}
		if(e==o)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(check(123456));
	}

}
