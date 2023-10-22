package com.sy;

public class StringProg 
{
	public static void test(int size,String s,char ch)
	{
		String[] a=new String[size];
		a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			char[] c=a[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==ch)
				{
					count++;
				}
				
			}
			if(count>0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		String s="Indian nanu manu";
		test(3,s,'n');
		
	}

}
