package com.assignment2;

public class SumOfStrongNum {
	
	static int strong(int start,int end)
	{
		int sum1=0;
		for(int i=start;i<=end;i++)
		{
			int sum=0;
			int n=i;
			
			while(n>0)
			{
				int fact=1;
				int rem=n%10;
				for(int j=1;j<=rem;j++)
				{
					fact=fact*j;
						
				}
				n=n/10;
				sum=sum+fact;
			}
			if(sum==i)
			{
				sum1=sum1+i;
				
			}
		}
		return sum1;
			
		
	}
	public static void main(String[] args) {
		System.out.println(strong(1, 100));
	}

}
