package com.collection;

public class Pattern {
	public static void main(String[] args) {
		int n=3;
		for(int row=n;row>=1;row--)
		{
			for(int s=n;s>row;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
