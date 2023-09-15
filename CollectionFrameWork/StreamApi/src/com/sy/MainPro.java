package com.sy;



	class A
	{
		public void display()
		{
			System.out.println("Hello");
		}
	}
	class B extends A
	{
		public void display()
		{
			System.out.println("B");
		}
	}
	public class MainPro {

		public static void main(String[] args) {
			
			A a=new B();
			a.display();
			((B)a).display();
			
			
			
			
			
			
			
		}
	
}
