package com.numbers_logics;

public class Spy_Number 
{
	public static String check(int n)
	{
		int sum=0 ,pro=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
			n=n/10;
		}
		System.out.println(sum+" == "+pro);
		if(sum==pro)
		{
			
			return "Spy Number";
		}
		return "Not a Spy Number";
	}
	public static void main(String[] args) {
		System.out.println(check(1234));
	}

}
