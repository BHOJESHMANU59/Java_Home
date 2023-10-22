package com.linkedlist;

public class MainLinkedList {
	public static void main(String[] args) {
		
		
		SinglyLinkedList l = new SinglyLinkedList();
		
		l.add(3);
		l.add(5);
		l.add(7);
		
		
		SinglyLinkedList l2 = new SinglyLinkedList();
	
		l2.add(8);
		l2.add(6);
		l2.add(9);
		l.add(12);
		l.add(22);
		l.add(32);
		l.add(42);
		l.add(52);
		l.add(62);
	
		l.display();
		System.out.println("\n==========================");
		l.addFirst(100);
		l.add(2);
		l.display();
		System.out.println("\n=========================");
		l.deletFirst();
		l.display();
		System.out.println("\n==========================");
		l.deleteLast();
		l.display();
		System.out.println("\n==========================");
		l.deleteLast();
		l.display();
		System.out.println("\n==============================");
		System.out.println(l.delete(1));
		l.display();
		
		System.out.println("\n==============================");
		
		l.printReverse();
		
		System.out.println("\n=================================");
		
		l.reverseSingleLL();
		
		l.display();
		
		System.out.println("\n-----------------------------");
		l.display();
		
		System.out.println(l.add1(l, l2));
		l.toString();
		
	}

}
