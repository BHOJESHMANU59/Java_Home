package com.arraysprograms;

import java.util.Arrays;

public class FineSecondLargestEle 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,6,7,5,8};
		int n=a.length;
		int secondmax=0;
		int secondMin=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		secondmax=a[n-2];
		secondMin=a[1];
		System.out.println(secondmax);
		System.out.println(secondMin);
		System.out.println(Arrays.toString(a));
	}

}
