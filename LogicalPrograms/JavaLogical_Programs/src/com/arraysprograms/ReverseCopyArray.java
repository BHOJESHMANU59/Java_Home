package com.arraysprograms;

import java.util.Arrays;

// Copy the Array in Reverse Order to Another Array

public class ReverseCopyArray 
{
	public static void main(String[] args) {
		int[] a= {1,3,2,4,5};
		int[] b=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[j++];
		}
		System.out.println(Arrays.toString(b));
		
		// Using forEach loop
		int k=a.length-1;
		int[] c=new int[a.length];
		for (int i : a)
		{
			c[k--]=i;
		}
		System.out.println(Arrays.toString(c));
	}

}
