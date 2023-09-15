package com.assignment1;

public class QuadraticRoots {
	static void roots(int a, int b, int c) {
		double root1, root2;

		double d = b * b - (4 * a * c);

		if (d > 0) 
		{
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);

			System.out.println("Root1 is :  " + root1 + " Root2 is :" + root2);
		} 
		else if (d == 0) 
		{
			root1 = root2 = (-b) / (2 * a);
			System.out.println("Roots Are :" + root1);
		}
		else 
		{
			double real = (-b) / (2 * a);
			double imginary = Math.sqrt(-d) / (2 * a);

			System.out.println("Root1 is: " +real+" + "+imginary + "i" );

			System.out.println("Root2" + " is: " + real+" - "+imginary + "i");
		}
	}

	public static void main(String[] args) {
		roots(1, 2, 3);
		System.out.println("-----------------------------------------------------");
		roots(3, 2, 1);
		System.out.println("-----------------------------------------------------");
		roots(1, -10, 2);
	}

}
