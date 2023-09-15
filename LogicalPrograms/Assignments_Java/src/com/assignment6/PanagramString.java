package com.assignment6;

import java.util.Arrays;

public class PanagramString 
{
	static String check(String str)
	{
		String st="abcdefghijklmnopqrstuvwxyz";
		char[] ch1=st.toCharArray();
		
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s=s+str.charAt(i);
			}
		}
		 s=s.toLowerCase();
		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		
		if(ch1.length==ch.length)
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch[i])
				{
					return "panagram";
				}
				
			}
			return "Not Panagrams";
		}
		
		return "Not Panagrams";
		
		
			
	}
	public static void main(String[] args) {
		String str="cba def gh ijk lmnop qrstuv wzxy ";
		System.out.println(check(str));
	}

}
