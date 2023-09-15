package com.assignment1;

public class NumDivideBy {
	static boolean divide(int n)
	{
		if(n%5==0 && n%11==0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(divide(123));
		System.out.println(divide(110));
	}

}
