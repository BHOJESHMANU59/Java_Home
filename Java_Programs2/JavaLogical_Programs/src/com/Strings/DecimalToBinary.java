package com.Strings;

// Converting Decimal to Binary Using Strings

public class DecimalToBinary 
{
	static void decimalToBinary(int n)
	{
		System.out.println("Decimal No :" +n);
		
		String binary="";
		
		while(n>0)
		{
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		System.out.println("Binary No: "+binary);
	}
	public static void main(String[] args) {
		decimalToBinary(10);
		
	}


}
