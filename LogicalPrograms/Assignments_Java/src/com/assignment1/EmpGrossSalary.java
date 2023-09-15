package com.assignment1;

import java.util.Scanner;

public class EmpGrossSalary 
{
	static void grossSal(double BS)
	{
		double HRA,DA;
		
		if(BS<=10000)
		{
			HRA=BS*0.2;
			DA=BS*0.8;
		}
		else if(BS<=20000)
		{
			HRA=BS*0.25;
			DA=BS*0.9;
		}
		else
		{
			HRA=BS*0.3;
			DA=BS*0.95;
		}
		
		System.out.println("Gross Salary : "+(BS+HRA+DA));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the Basic Salary");
			double basicSal=sc.nextDouble();
			grossSal(basicSal);
			System.out.println("---------------------------");
		}
		
	}

}
