package com.searching_algorithams;

public class Linear_Searching
{
	static void linearSearch(int[] ar,int val)
	{
		int pos=-1;
		int i=1;
		int n=ar.length;
		
		while(i<=n)
		{
			if(ar[i]==val)
			{
				pos=i;
				System.out.println("Element found At index :"+pos);
				break;
			}
			i++;
			
			
		}
		if(pos==-1)
		{
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		int[] a= {10,40,20,60,90,30,50,80,70};
		linearSearch(a, 80);
	}

}
