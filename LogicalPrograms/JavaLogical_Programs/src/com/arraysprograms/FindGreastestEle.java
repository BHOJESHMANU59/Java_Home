package com.arraysprograms;


// Find Greatest Element in the Given Array

public class FindGreastestEle {
	public static void main(String[] args) {
		int[] a= {8,3,2,5,6};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
