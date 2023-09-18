package com.assignment2;

import java.util.Scanner;

public class DuckNumber 
{
	static String check(String n)
	{
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(0)!=48 && n.charAt(i)==48 && n.charAt(i)>=48 && n.charAt(i)<=57)
			{
				return "Duck";
			}
		}
		return "not Duck";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		String s=sc.next();
		System.out.println(check(s));
	}

}
