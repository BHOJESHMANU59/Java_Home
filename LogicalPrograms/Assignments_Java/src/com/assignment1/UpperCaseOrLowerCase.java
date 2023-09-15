package com.assignment1;

public class UpperCaseOrLowerCase 
{
	static void check(char ch)
	{
		if(ch>=65 && ch<=90)
		{
			System.out.println("Given Character is UpperCase");
		}
		else
		{
			System.out.println("Given Character is LoweCase");
		}
	}
	public static void main(String[] args) {
		check('A');
		check('b');
	}

}
