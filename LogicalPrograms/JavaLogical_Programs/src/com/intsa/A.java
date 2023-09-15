package com.intsa;

public class A {
	int i=m1();
	A()
	{
		System.out.println("Constructor");
	}
	int m1()
	{
		System.out.println("m1 method");
		return 20;
	}
	
	{
		System.out.println("Instanc block");
	}
	public static void main(String[] args) {
		A a=new A();
	}
	

}
