package com.queues;

public class MainQueue	
{
	public static void main(String[] args) {
	//Queue q=new Queue(5);
		DynamicQueue q=new DynamicQueue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		
		q.display();
		
		System.out.println(q.deque());
		System.out.println(q.deque());
		
		q.display();
		
		System.out.println("Size of Queue is :"+q.size());

		
		System.out.println(q.deque());
		System.out.println(q.deque());
		
		System.out.println(q.deque());
		System.out.println(q.deque());
	
	}
	
}
