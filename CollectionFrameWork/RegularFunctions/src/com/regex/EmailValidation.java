package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation 
{
	public static void email(String email)
	{
		Pattern p=Pattern.compile("[A-Z,a-z]{3,10}[0-9]{2,5}@gmail[.]com");
	    Matcher m = p.matcher(email);
	    System.out.println(m.matches());
	    
	}
	public static void main(String[] args) {
		email("manu12@gmail.com");
	}

}
