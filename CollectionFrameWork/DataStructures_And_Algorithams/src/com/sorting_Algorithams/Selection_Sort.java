package com.sorting_Algorithams;

import java.util.Arrays;

public class Selection_Sort {
	static void selectionSort(int ar[] )
	{
		for(int i=0;i<ar.length;i++)
		{
			int minIndex=i;
			
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[j]<ar[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=ar[minIndex];
			ar[minIndex]=ar[i];
			ar[i]=temp;
		}
	}
	public static void main(String[] args) {
		int[] a= {4,2,1,5,3,6};
		System.out.println(Arrays.toString(a));
		
		selectionSort(a);
		
		System.out.println(Arrays.toString(a));
	
	}

}
