package com.arraysprograms;

// Remove The Duplicates And Print the Elements

public class RemoveDuplicates
{
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,6,8,9,2,1,9};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.println(a[i]);
			}
			
			
		}
	}

}
