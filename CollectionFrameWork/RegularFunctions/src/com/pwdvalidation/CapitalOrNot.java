package com.pwdvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Whether the String Start with Capital or not

public class CapitalOrNot {
	public static void main(String[] args) {
		String s="Abcd";
		Pattern p=Pattern.compile("[A-Z].*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
		System.out.println(m.group());
		System.out.println(m.pattern());
	}

}
