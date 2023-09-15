package com.pwdvalidation;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Java";
		System.out.println(s1+"   "+s2);
		StringBuffer s=new StringBuffer(s1);
		s1=s2;
		s2=s.toString();
		System.out.println(s1+"   "+s2);
		


	}

}
