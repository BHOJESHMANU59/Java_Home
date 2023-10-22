package com.stringbuffer_stringbuilder;

public class StringBuilderEx 
{
	public static void main(String[] args) {
		
		//append() : this method is used to add a specified String to the end of the current String
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		System.out.println("-----------------------------------------------------------------");
		
		// insert() : this method is used to insert the specified String at the Specified position in the current String
	   
		StringBuilder sb1=new StringBuilder("Hello");
		sb1.insert(2, " Java ");
		System.out.println(sb1);
		
		System.out.println("-----------------------------------------------------------------");
	
		// delete() : Delete the Characters b/w the Specified Start and End position in the current String
		
		sb1.delete(2, 8);
		System.out.println(sb1);
		
		System.out.println("-----------------------------------------------------------------");
		
		// replace() : this method is used to replace the characters b/w the specified start and end position with the Specified String
		StringBuffer sb3=new StringBuffer("Hi Java ");
		sb3.replace(0, 2, "Hello");
		System.out.println(sb3);
		
		System.out.println("-----------------------------------------------------------------");
		
		// substring() : this method is used to print a part of String from original String
		
		String s = sb3.substring(6, 8);
		System.out.println(s);
		
		System.out.println("-----------------------------------------------------------------");
		
		
		// indexOf() : this method returns the specified  index position of the given String from original String
		
		int indexOf = sb3.indexOf("J");
		System.out.println(indexOf);
		
		System.out.println("-----------------------------------------------------------------");
		
		// revers() : this method is used to reverse the String
		
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
		
		System.out.println("-----------------------------------------------------------------");
		
		// length() : this method used to return length of the given String
		
		int length = sb.length();
		System.out.println(length);
		
		System.out.println("-----------------------------------------------------------------");
		
		// charAt() : this method used to return the character at the specified index position
		
		System.out.println(sb1.charAt(1));
	}
	
	

}
