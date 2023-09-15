package com.searching_algorithams;

public class LeanerSearchEx2 
{
	static int linearSearch(int[] ar,int key)
	{
		int i;
		
		for(i=0;i<ar.length;i++)
		{
			
			if(ar[i]==key)
			{
				return i;
				
				
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {20,10,40,50,30,60,90};
		int res=linearSearch(a, 90);
		
		
		if(res!=-1)
		{
			System.out.println("Elements found at index :"+res);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
