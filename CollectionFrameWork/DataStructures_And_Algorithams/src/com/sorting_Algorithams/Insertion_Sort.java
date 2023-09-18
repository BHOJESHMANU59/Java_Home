package com.sorting_Algorithams;

// Insertion 

import java.util.Arrays;

public class Insertion_Sort {

	static void insertionSort(int[] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			int key=ar[i];
			int j=i-1;
			
			while(j>=0 && (ar[j]>key))
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,1,5,2};
		System.out.println(Arrays.toString(a));
		
		insertionSort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
