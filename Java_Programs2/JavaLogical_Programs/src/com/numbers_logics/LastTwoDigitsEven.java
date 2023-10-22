package com.numbers_logics;

// Return true if last two digits are Even else return false

public class LastTwoDigitsEven {
	public static boolean lasttwodigits(int n)
	{
		int last,first;
		n=n%100;
		last=n%10;
		first=n/10;
		if(first%2==0 && last%2==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(lasttwodigits(100));
		System.out.println(lasttwodigits(12345));
	}

}
