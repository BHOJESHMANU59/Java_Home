package com.thread;

public class TimeWaitingState 
{
	public static void main(String[] args) throws InterruptedException 
	{
		DemoTimeWait d=new DemoTimeWait();
		Thread t=new Thread(d);
		t.start();
		t.sleep(1000);
		System.out.println(t.getState());
		
		
	}

}

class DemoTimeWait implements Runnable
{

	@Override
	public void run() 
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
	
}
