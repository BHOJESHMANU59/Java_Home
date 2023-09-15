package com.assignment1;

import java.util.Scanner;

public class GradeCalculation 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks of All Subject");
		System.out.println("Physics :");
		double P=sc.nextDouble();
		System.out.println("Chemistry :");
		double C=sc.nextDouble();
		System.out.println("Biology :");
		double B=sc.nextDouble();
		System.out.println("Maths :");
		double M=sc.nextDouble();
		System.out.println("Computer Science :");
		double Cs=sc.nextDouble();
		
	    double per=P+C+B+M+Cs/5;
	    
	    if(per>=90)
	    {
	    	System.out.println("A Grade");
	    }
	    else if(per>=80 && per<90)
	    {
	    	System.out.println("B Gread");
	    }
	    
	    else if(per>=70 && per<80)
	    {
	    	System.out.println("C Grade");
	    }
	    else if(per>=60 && per<70)
	    {
	    	System.out.println("D Gread");
	    }
	    
	    else if(per>=40 && per<60)
	    {
	    	System.out.println("E Grade");
	    }
	    else 
	    {
	    	System.out.println("F Gread");
	    }
	    
	}

}
