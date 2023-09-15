package com.sorting_Algorithams;

// Bubble Sort Algoritham 

public class Bubble_Sort {
	
	static void bubbleSort(int[] ar)
	{	
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-i-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(ar));
	}
	public static void main(String[] args) {
		int a[]= {3,4,1,2,5,8,6,7};
		int b[]= {};
		int[] c= {1};
	    bubbleSort(a);
	    bubbleSort(b);
	    bubbleSort(c);
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
	   
	    for(int i=0;i<c.length;i++)
	    {
	    	System.out.println(c[i]+" ");
	    }
	}

}
