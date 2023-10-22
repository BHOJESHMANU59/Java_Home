package com.thread;

public class ThreadLifeCycle implements Runnable
{

	@Override
	public void run() 
	{
		myTask();
		
	}
	
	synchronized public static void myTask()
	{
		while(true)
		{
			
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadLifeCycle t=new ThreadLifeCycle();
		Thread th1=new Thread(t);
		Thread th2=new Thread(t);
		System.out.println(th2.getState());
		th1.start();
		th2.start();
		System.out.println(th2.getState());
		Thread.sleep(1000);
		System.out.println(th2.getState());
		
		
	}
	

}
