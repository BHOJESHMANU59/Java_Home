package com.arraysprograms;

// Prints Only Duplicate Elements

public class PrintDuplicateELe 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,5,3,1,4,7,9,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
