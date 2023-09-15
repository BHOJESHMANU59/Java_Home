package com.queues;

public class DynamicQueue {

	class Node
	{
		Object data;
		Node next;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node front;
	Node rear;
	
	int size=0;
	
	public void enque(Object data)
	{
		Node n=new Node(data);
		if(front==null)
		{
			front=rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public void display()
	{
		Node temp=front;
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	public Object deque()
	{
		if(front==null)
		{
			System.out.println("Queue Is Empty");
			return null;
		}
		else
		{
			Object data=front.data;
			front=front.next;
			if(front==null)
			{
				rear=null;
			}
			size--;
			return data;
		}
		
	}

}
