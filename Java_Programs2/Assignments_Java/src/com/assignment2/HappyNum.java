package com.assignment2;

public class HappyNum 
{
	static int happyno(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			int n=i;
			while(n>9)
			{
				n=check(n);
			}
			if(n==1)
			{
				count++;
			}
		}
		return count;
		
	}
	
	static int check(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(happyno(1, 500));
	}

}
