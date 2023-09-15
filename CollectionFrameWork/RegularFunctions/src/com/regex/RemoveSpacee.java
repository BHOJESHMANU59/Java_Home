package com.regex;

public class RemoveSpacee 
{
	public static String removesSpace(String inp_string)
	{
		String s="";
		for(int i=0;i<inp_string.length();i++)
		{
			if(inp_string.charAt(i)!=' ')
			{
				
				s=s+inp_string.charAt(i);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		
		System.out.println(removesSpace("good day"));
	}

}
