package com.Strings;

// WAJP to Generate 4 SubString Where 1st SubString having UpperCase and 2nd SubString having LowerCase and
//  3rd SubString having Numbers and 4th SubString having Special Characters.

public class SubStringofDiffCases 
{
	static void print(String s)
	{
		String UpperCase="";
		String LowerCase="";
		String Numerics="";
		String SpecialChars="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				UpperCase+=s.charAt(i);
			}
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				LowerCase+=s.charAt(i);
			}
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				Numerics+=s.charAt(i);
			}
			else
			{
				SpecialChars+=s.charAt(i);
			}
		}
		System.out.println("UpperCase Char : "+UpperCase);
		System.out.println("LowerCase Char : "+LowerCase);
		System.out.println("Numerics Char : "+Numerics);
		System.out.println("Special Char : "+SpecialChars);
		
	}
	public static void main(String[] args) {
		print("abcA123@_137ACD");
	}

}
