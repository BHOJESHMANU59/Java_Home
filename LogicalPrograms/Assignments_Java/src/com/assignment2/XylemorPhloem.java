package com.assignment2;

import java.util.Scanner;

public class XylemorPhloem 
{
	static String check(int n)
	{
		int se=n%10;
		n=n/10;
		int sum=0;
		while(n>9)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		se=se+n;
		if(sum==se)
		{
			return "Xylem";
		}
		return "Phloem";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		System.out.println(check(n));
	}

}
