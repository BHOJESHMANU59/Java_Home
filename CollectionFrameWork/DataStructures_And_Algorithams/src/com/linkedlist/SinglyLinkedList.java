package com.linkedlist;


public class SinglyLinkedList {
	  Node head;
	  Node tail;
	class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}
	
	  													
	public void add(Object data) {
		Node n = new Node(data);
		if (head == null)
		{
			head = tail = n;
			return;
		}
		else
		{
			tail.next = n;
			tail = n;
		}
	}

	public void display() 
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}

	public void addFirst(Object data) {
		Node n = new Node(data);
		if (head == null) 
		{
			head = tail = n;
		}
		else
		{
			n.next = head;
			head = n;
		}
	}

	public Object deletFirst()
	{
		if (head == null)
		{
			throw new UnsupportedOperationException("List is Empty");
		}
		Object data = head.data;
		head = head.next;
		if (head == null) 
		{
			tail = null;
		}
		return data;

	}

	public Object deleteLast() 
	{
		if (head == null)
		{
			throw new UnsupportedOperationException("List is Empty");
		}
		Object data = tail.data;
		Node temp = head;
		Node prev = null;
		while (temp.next != null)
		{
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		tail.next = null;
		return data;
	}

	public void add(Object data, int i) 
	{
		if (i == 0)
		{
			addFirst(data);
			return;
		}

		Node temp = head;
		while (temp != null && i > 1)
		{
			temp = temp.next;
			i--;
		}

		if (temp != null) 
		{
			Node n = new Node(data);
			n.next = temp.next;
			temp.next = n;
			if (n.next == null) {
				tail = n;
			}
		} else {
			System.out.println("Index not in the range");
		}
	}

	public Object delete(int i) {
		if (i == 0) 
		{
			return deletFirst();
		}

		Node temp = head;
		Node prev = null;
		while (temp != null && i > 0) {
			prev = temp;
			i--;
			temp = temp.next;
		}
		if (temp != null)
		{
			prev.next = temp.next;
			if (temp.next == null)
			{
				tail = prev;
			}
			return temp.data;
		}
		else 
		{
			System.out.println("Inavild index");
			return null;
		}

	}

	public void printReverse()
	{
		reverse(head);
	}

	private void reverse(Node start) {
		if (start.next != null) {
			reverse(start.next);
		}
		System.out.print(start.data + " <--");
	}
	
	public void reverseSingleLL()
	{
		reverseLL(head);
		
		Node t=head;
		head=tail;
		tail=t;
	}

	private void reverseLL(Node start) 
	{
		Node temp=null;
		Node prev=null;
		while(start!=null)
		{
			temp=start.next;
			start.next=prev;
			prev=start;
			start=temp;
		}
		
	}
	
	
	public SinglyLinkedList add1(SinglyLinkedList l1,SinglyLinkedList l2)
	{
		SinglyLinkedList sl=new SinglyLinkedList();
		int carry=0;
		Node h1=l1.head;
		Node h2=l2.head;
		
		while(h1!=null && h2!=null)
		{
			int sum=carry+(Integer)h1.data+(Integer)h2.data;
			carry=sum/10;
			sl.add(sum%10);
			
			h1=h1.next;
			h2=h2.next;
		}
		
		while(h1!=null)
		{
			int sum=carry+(Integer)h1.data;
			carry=sum/10;
			sl.add(sum%10);
			h1=h1.next;
		}
		
		while(h2!=null)
		{
			int sum=carry+(Integer)h2.data;
			carry=sum/10;
			sl.add(sum%10);
			h2=h2.next;
		}
		
		if(carry!=0)
		{
			sl.add(carry);
		}
		
		return sl;
	}


	

}
