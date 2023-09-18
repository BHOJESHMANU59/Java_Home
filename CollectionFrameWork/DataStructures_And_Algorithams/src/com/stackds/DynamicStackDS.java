package com.stackds;

public class DynamicStackDS {
	public static void main(String[] args) {
		
		Dynamic_Stack ds=new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		
		ds.dispaly();
		
		System.out.println(ds.pop());
		
		ds.dispaly();
	}

}
