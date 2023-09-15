package com.stackds;

public class Stack {
	private Object[] obj;
	private int capacity;
	private int top;
	public Stack(int capacity) 
	{
		super();
		this.capacity = capacity;
		top = -1;
		obj = new Object[capacity];	
	}
	public void push(Object data) {
		if(top==capacity-1)
		{
			System.out.println("Stack Overflow..");
			return;
		}
		else
		{
			top++;
			obj[top]=data;
			System.out.println(data+" had been inserted...");
		}
	}
	public void dispaly() 
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(obj[i]+"  ");
			}
			System.out.println();
		}
		
	}
	
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack UnderFlow...");
			return null;
		}
		else
		{
			
			return obj[top--];
		}
	}
	
	public Object peek()
	{
		if(top==-1)
		{
			System.out.println("Stack UnderFlow...");
			return null;
		}
		else
		{
			return obj[top];
		}
	}
	public int search(Object data)
	{
		for(int i=top;i>=0;i--)
		{
			if(obj[i]==data)
			{
				return top-i+1;
			}
		}
		return 0;
	}
	public int size() 
	{
		return top+1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==obj.length-1)
		{
			return true;
		}
		return false;
	}
	
	
	

}
