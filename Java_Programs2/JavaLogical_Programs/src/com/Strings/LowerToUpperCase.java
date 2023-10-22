package com.Strings;

//  Converting Lower To Upper Case without using Inbuild Methods

public class LowerToUpperCase 
{
	public static void main(String[] args) {
		String s="abCdef";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				str=str+(char)(s.charAt(i)-32);
			}
			else
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
