package com.sorting_Algorithams;

import java.util.Arrays;

public class MergeSorting {
	
	static void mergeSort(int[] ar,int beg,int end)
	{
		if(beg<end)
		{
			int mid=(beg+end)/2;
			mergeSort(ar,beg,mid);
			mergeSort(ar,mid+1,end);
			merge(ar,beg,mid,end);
		}
		
	}
	
	static void merge(int[] ar,int beg ,int mid,int end)
	{
		int n1=mid-beg+1;
		int n2=end-mid;
		
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			left[i]=ar[beg+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			right[j]=ar[mid+1+j];
		}
		
		int i=0,j=0,k=beg;
		
		
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				ar[k]=left[i];
				i++;
				
			}
			else
			{
				ar[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			ar[k]=left[i];
			i++;
			k++;
			
		}
		while(j<right.length)
		{
			ar[k]=right[j];
			j++;
			k++;
			
		}
	}
	public static void main(String[] args) {
		int[] a= {3,2,4,1};
		System.out.println(Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}

}
 