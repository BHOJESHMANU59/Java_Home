package com.queues;

public class Queue {

	int front ,rear;
	int capacity;
	Object[] obj;
	public Queue(int capacity) {
		super();
		this.capacity = capacity;
		obj=new Object[capacity];
		front=rear=-1;
		
	}
	
	public void enque(Object data)
	{
		if(rear==capacity-1)
		{
			System.out.println("Queue is Full");
			return;
		}
		
		if(front==-1)
		{
			front=0;
		}
		
		obj[++rear]=data;				
	}
	
	public int size()
	{
		return rear-front+1;
	}
	
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(obj[i]+" ");
		}
		System.out.println();
		
	}
	
	public Object deque()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return null;
		}
		Object data=obj[front++];
		if(front>rear)
		{
			front=rear=-1;
		}
		return data;
	}
}
