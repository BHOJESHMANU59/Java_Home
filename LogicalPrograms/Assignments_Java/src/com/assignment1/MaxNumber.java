package com.assignment1;

public class MaxNumber {
	static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.println("Max Number b/w two Numbers is :"+max(10,20));
	}

}
