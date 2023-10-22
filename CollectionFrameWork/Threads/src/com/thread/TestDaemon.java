package com.thread;

//   18)Can we make the user thread as daemon thread if the thread is started?
// Ans: No, if you do so, it will throw IllegalThreadStateException. 
//      Therefore, we can only create a daemon thread before starting the thread.

public class TestDaemon extends Thread
{
	public void run()
	{
		System.out.println("Running Thread");
	}
	public static void main(String[] args) {
		TestDaemon t=new TestDaemon();
		t.start();
		t.setDaemon(true);
	}

}
