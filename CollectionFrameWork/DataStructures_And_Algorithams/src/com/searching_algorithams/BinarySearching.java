package com.searching_algorithams;

public class BinarySearching 
{
	static int binarySearch(int[] ar,int key,int beg,int end) 
	{
		int mid=(beg+end)/2;
		if(end<beg)
		{
			return -1;
		}
		if(ar[mid]==key)
		{
			return mid;
		}
		else if(ar[mid]<key)
		{
			return binarySearch(ar, key, mid+1, end);
		}
		else
		{
			return binarySearch(ar, key, beg, mid-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int key=9;
		int index = binarySearch(a, key, 0, a.length);
		if(index==-1)
		{
			System.out.println("Element not Found");
		}
		else
		{
			System.out.println("Element found at Index :"+index);
		}
		
		
	}

}
