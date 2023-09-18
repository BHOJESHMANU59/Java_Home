package com.stackds;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StringBalanced {

	public static boolean isBalanecd(String s) {
		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				stk.push(ch);
			} else {
				if (ch == '}') {
					if (stk.pop() != '{') {
						return false;
					}
				} else if (ch == ']') {
					if (stk.pop() != '[') {
						return false;
					}
				} else if (ch == ')') {
					if (stk.pop() != '(') {
						return false;
					}
				}

			}
		}
	
		return stk.isEmpty();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String s = sc.next();

		boolean b = isBalanecd(s);

		if(b) {
			System.out.println("String Is Balanced");
		} else {
			System.out.println("String is not Balanced");
		}

	}

}
