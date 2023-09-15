package com.arraysprograms;

import java.util.Arrays;

// Copy Array Element to Another Array

public class CopyArrayEle 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,5,4};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
		// Using ForEach loop
		int[] c=new int[a.length];
		int j=0;
		for (int i : a) 
		{
			c[j++]=i;
			
		}
		System.out.println(Arrays.toString(c));
	}

}
