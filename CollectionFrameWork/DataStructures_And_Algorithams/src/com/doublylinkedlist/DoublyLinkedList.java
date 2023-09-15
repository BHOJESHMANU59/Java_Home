package com.doublylinkedlist;

public class DoublyLinkedList {
	class Node
	{
		Object data;
		Node next;
		Node prev;
		public Node(Object data) {
			super();
			this.data = data;
			
		}
	}
	Node head;
	Node tail;
	
	//Inserting Objects Into Linked List 
	
	public void add(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return ;
		}
		n.prev=tail;
		tail.next=n;
		tail=n;
	}
	
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" <--> ");
			temp=temp.next;
		}
		System.out.println();
	}
	public void addFirst(Object data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return ;
		}
		n.next=head;
		head.prev=n;
		head=n;
	}
	
	public void add(Object data,int i)
	{
		if(i==0)
		{
			addFirst(data);
			return;
		}
		Node temp=head;
		while(i>0 && temp!=null)
		{
			i--;
			temp=temp.next;
		}
		if(temp==null)
		{
			System.out.println("index not in the Range");
		}
		else
		{
			Node n=new Node(data);
			n.next=temp;
			n.prev=temp.prev;
			temp.prev.next=n;
			temp.prev=n;
			
			/*
			    n.next=emp.next;
			    n.prev=temp;
			    temp.next=n;
			    if(n.next!=null)
			    {
			      n.next;
             */
		}
	}
	public Object deleteFirst()
	{
		if(head==null)
		{
			throw new UnsupportedOperationException("List is Empty");
		}
		Object data=head.data;
		head=head.next;
		if(head!=null)
		{
			head.prev=null;
		}
		else
		{
			tail=null;
		}
		return data;
		
	}
	// Reverse The Doubly LinkedList
	public void reverseLL()
	{
		reverse(head);
		
		Node temp=head;
		head=tail;
		tail=temp;
		
	}
	private void reverse(Node start) 
	{
		while(start!=null)
		{
			Node temp=start.next;
			start.next=start.prev;
			start.prev=temp;
			start=temp;
		}
		
	}

	public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.add(10);
		dl.add(30);
		dl.add(20);
		dl.display();
		dl.addFirst(50);
		dl.display();
		dl.add(90, 2);
		dl.display();
	System.out.println(dl.deleteFirst());
		dl.display();
		
		dl.reverseLL();
		dl.display();
	}
	
}
