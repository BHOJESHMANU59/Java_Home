package com.pwdvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContain_ABC {

	public static void main(String[] args) {
		String s="abcABCXyz";
		Pattern p=Pattern.compile(".*ABC.*");
		Pattern p1=Pattern.compile("[a,A].*");
		Matcher m1=p1.matcher(s);
		System.out.println(m1.matches());
		System.out.println("------------------------");
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
		
		
	}
}
