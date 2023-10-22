package com.Strings;

//Converting numeric String to Number

public class StringToNumber 
{
	public static void main(String[] args) {
		String s="123";
		int n=0;
		 for(int i=0;i<s.length();i++)
		 {
			 int a=s.charAt(i)-48;
			 n=n*10+a;
		 }
		 System.out.println(n);
	}

}
