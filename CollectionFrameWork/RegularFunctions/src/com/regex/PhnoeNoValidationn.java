package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhnoeNoValidationn 
{
	public static String valid(String phno)
	{
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(phno);
		System.out.println(m.matches());
		if(m.matches()!=true)
		{
			return "Not valid";
		}
		return "valid";
	}
	public static void main(String[] args) {
		System.out.println(valid("774044334"));
	}

}
