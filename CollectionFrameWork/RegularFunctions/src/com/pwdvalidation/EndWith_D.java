package com.pwdvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndWith_D {
	public static void main(String[] args) {
		String s="AbcD";
		Pattern p=Pattern.compile(".*D");
		Matcher m=p.matcher(s);
		System.out.println(m.matches());
		
	}

}
