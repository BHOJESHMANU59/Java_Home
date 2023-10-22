package com.assignment2;

public class SpecialDigitRange 
{
	static void special(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			int pro=1;
			int num=i;
			
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				pro=pro*rem;
				num=num/10;
			}
			if(sum==pro)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		special(10, 100);
	}

}
