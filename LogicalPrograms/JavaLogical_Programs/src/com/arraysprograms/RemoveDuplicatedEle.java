package com.arraysprograms;


// Removing Duplicated Elements(unique Elements only)

public class RemoveDuplicatedEle 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,2,4,5,6,7,3,2};
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
					c++;
				}
			}
			if(c==1 && a[i]!=-1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
