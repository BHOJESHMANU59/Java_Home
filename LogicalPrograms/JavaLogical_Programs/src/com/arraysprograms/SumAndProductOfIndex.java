package com.arraysprograms;

// Sum of Odd index , Product of Even Index 

public class SumAndProductOfIndex 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4};
		int o=0;
		int e=1;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				e=e*a[i];
			}
			else
			{
				o=o+a[i];
			}
		}
		
		System.out.println(e);
		System.out.println(o);
		
		int e1=1;
		int o1=0;
		int j=0;
		for (int i : a)
		{
			if(j%2==0)
			{
				e1=e1*i;
			}
			else
			{
				o1=o1+i;
			}
			
			j++;
			
		}
		System.out.println(o1);
		System.out.println(e1);
	}
	
}
