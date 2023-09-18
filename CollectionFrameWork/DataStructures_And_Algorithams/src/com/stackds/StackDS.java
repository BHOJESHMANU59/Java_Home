package com.stackds;

public class StackDS {
	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.dispaly();
		
		System.out.println(s.pop()+" ");
		System.out.println("--------------------------------");
		s.dispaly();
		
		System.out.println(s.peek());
		System.out.println(s.peek());
		s.dispaly();
		
		System.out.println("Element Found At Position : "+s.search(20));
		
		System.out.println("Size Of Stack : "+s.size());
		
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
	}

}
