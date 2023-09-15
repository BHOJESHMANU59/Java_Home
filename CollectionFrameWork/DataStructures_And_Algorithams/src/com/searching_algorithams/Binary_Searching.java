package com.searching_algorithams;

public class Binary_Searching 
{
	static void binarySearch(int ar[],int beg,int end,int val)
	{
		
		int pos=-1;
		
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			if(ar[mid]<val)
			{
				beg=mid+1;
				
			}
			else if(ar[mid]==val)
			{
				pos=mid;
				System.out.println("Element Found at index: "+pos);
				break;
			}
			else
			{
				end=mid-1;
			}
			
		}
		if(pos==-1)
		{
			System.out.println("The Elements not Prsent In the Given Array");
		}
	}
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		int beg=0;
		int end=array.length-1;
		System.out.println(end);
		
		
		binarySearch(array, beg, end, 1);
	}

}
