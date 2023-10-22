package com.Strings;

// Upper case to Lower Case Converting

public class UpperToLowerCase 
{
	public static void main(String[] args) {
		String s="AbcDEf";
		String str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				str=str+(char)(s.charAt(i)+32);
			}
			else
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);
	}


}
