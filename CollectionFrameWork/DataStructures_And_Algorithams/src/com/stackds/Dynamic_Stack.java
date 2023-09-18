package com.stackds;

public class Dynamic_Stack {
	class Node
	{
		Object data;
		Node next;
	    Node prev;
		Node(Object data)
		{
			this.data=data;
		}
	}
	Node top;
	int size;
	
	public void push(Object data)
	{
		Node n=new Node(data);
		if(top==null)
		{
			top=n;
		}
		else
		{
			n.prev=top;
			top=n;
		}
		size++;
	}
	
	public Object pop()
	{
		if(top==null)
		{
			System.out.println("Stack UnderFlow");
			return null;
		}
		else
		{
			Object data=top.data;
			top=top.prev;
			size--;
			System.out.println();
			return data;
		}
		
	}
	
	public Object peek()
	{
		if(top==null)
		{
			System.out.println("Stack UnderFlow");
			return null;
		}
		else
		{
			return top.data;
		}
	}
	
	public void dispaly()
	{
		print(top);
		System.out.println();
	}

	private void print(Node start) 
	{
		if(start==null)
		{
			return;
		}
		else
		{
			print(start.prev);
			System.out.print(start.data+" -- ");
		}
		
	}
	
	public int size()
	{
		return size;
	}
	
	public int search(Object data)
	{
		Node temp=top;
		int i=0;
		while(temp!=null)
		{
			i++;
			if(temp.data==data)
			{
				return i;
			}
			else
			{
				temp=temp.prev;
			}
		}
		return 0;
	}

}
