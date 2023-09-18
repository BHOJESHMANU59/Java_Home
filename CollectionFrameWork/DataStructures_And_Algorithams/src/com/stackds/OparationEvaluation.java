package com.stackds;

import java.util.Scanner;
import java.util.Stack;

public class OparationEvaluation 
{
	
	static int evaluate(String str)
	{
		 Scanner sc=new Scanner(System.in);
		Stack<Integer> stk=new Stack<Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(Character.isAlphabetic(i))
			{
				System.out.println("Enter the Value of :"+ch);
				
				stk.push(sc.nextInt());
			}
			else
			{
				int y=stk.pop();
				int x=stk.pop();
				
				switch (ch)
				{
				case '+' : stk.push(x+y);
				break;
				case '-' : stk.push(x-y);
				break;
				case '*' : stk.push(x*y);
				break;
				case '/' : stk.push(x/y);
				
				}
			}
		}
		return stk.pop();
	}
	public static void main(String[] args) {
	    int value = evaluate("abc*+d-");
	    System.out.println(value);
	}

}
