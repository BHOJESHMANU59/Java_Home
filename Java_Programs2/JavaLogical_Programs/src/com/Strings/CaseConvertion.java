package com.Strings;

// Converting LowerCase To Upper Case and Upper To Lower Case

public class CaseConvertion 
{
	public static void conversation(String str)
	{
		String s="";    // Empty String
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				s=s+(char)(str.charAt(i)+32);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				s=s+(char)(str.charAt(i)-32);
			}
		}
		System.out.println(str);
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		conversation("AbcdE");
	}

}
