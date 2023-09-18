package com.assignment1;

public class CharacterIsAlphabetOrNot {
	
	static String check(char ch)
	{
		
		if(ch>=65 && ch<=90 || ch>=97 && ch<=122)
		{
			return "Alphabet Character";
		}
		return "Not Alphabet Character";
	}
	
	public static void main(String[] args) {
		
		System.out.println(check('A'));
		System.out.println(check('b'));
		System.out.println(check('@'));
		
	}

}
