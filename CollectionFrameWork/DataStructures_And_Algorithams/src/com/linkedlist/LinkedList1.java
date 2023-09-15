package com.linkedlist;

class Node 
{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
public class LinkedList1 {
	Node head;
	
	Node insertbeg(int val,Node head)
	{
		Node temp=new Node(val);
		if(head==null)
		{
			head=temp;
			
		}
		else
		{
			temp.next=head;
			head=temp;
		}
		return head;
		
	}

	void display(Node head)
	{
		Node ttmp=head;
		while(ttmp!=null)
		{
			System.out.print(ttmp.data+" ");
			 ttmp=ttmp.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedList1 l=new LinkedList1();
		System.out.println(l.insertbeg(10, l.head));
		l.display(l.head);
		
	}

}
