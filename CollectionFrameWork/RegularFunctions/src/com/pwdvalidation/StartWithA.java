package com.pwdvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartWithA {
	public static void main(String[] args) {
		String s="ABcd";
		Pattern p=Pattern.compile("A.*");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}

}
