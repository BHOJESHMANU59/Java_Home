package com.Strings;

public class HachCodeValuesOfStr
{
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hi");
		String s3=new String("Hi");
		String s4="Hello";
		
		System.out.println(s1.hashCode()+  "    "+ s4.hashCode());
		System.out.println("---------------------------------------");
		System.out.println(s2.hashCode()+"   "+s3.hashCode());
	
	}

}
