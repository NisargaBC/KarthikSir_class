package com.Thread;

class MyThread extends Thread
{
	public void run()
	{
		for(int i =1; i<=5; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
			}
		}
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		MyThread m1 = new MyThread();
//		m1.run(); // single tasking :- if i run this line it will print one by one first it'll print m1 and then m2 then m3 
		m1.start(); // mutlitasking :- if i run this line it will print at a time m1, m2, m3
		MyThread m2 = new MyThread();
//		m2.run();
		m2.start(); // mutlitasking
		MyThread m3 = new MyThread();
//		m3.run();
		m3.start(); // mutlitasking
		System.out.println(" the end...");
		
	}

}
