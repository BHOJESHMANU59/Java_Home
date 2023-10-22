package com.assignment2;
//Chethan
import java.util.Arrays;

public class Sample 
{
	public static void main(String[] args) 
	{
		int[] a= {4,9,5,3,2,10};
		int[] op=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[i])
				{
					
					count++;	
				}
				
			}
			op[i]=count;
		}
		System.out.println(Arrays.toString(op));
		
		
	}

}
