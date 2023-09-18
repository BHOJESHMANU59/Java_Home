package com.numbers_logics;

// Print Even Digits in a given Number

public class EvenDigits {
	public static void even(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.print(rem+" ");
			}
			n/=10;
		}
	}
	public static void main(String[] args) {
		even(1234567);
	}

}
