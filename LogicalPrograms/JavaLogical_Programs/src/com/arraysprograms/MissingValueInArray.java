package com.arraysprograms;
// Find Missing Value in Given Array

public class MissingValueInArray 
{
	public static void main(String[] args) {
		int[] a= {1,3,4,2,6,7,8,9,10};
		int n=a.length+1;
		int sum=0;
		for (int i : a) 
		{
			sum=sum+i;	
		}
		int SumofN_naturalNo=n*(n+1)/2;
		int Missing_Value=SumofN_naturalNo-sum;
		System.out.println(Missing_Value);
	}
	

}
