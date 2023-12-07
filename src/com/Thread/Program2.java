package com.Thread;

import java.util.Iterator;

class OwnThread implements Runnable
{
	public void run()
	{
		for(int i = 5; i>=1; i--)
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

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		OwnThread o1 = new OwnThread();
		Thread t1 = new Thread(o1);
		t1.run();
//		t1.start();
		OwnThread o2 = new OwnThread();
		Thread t2 = new Thread(o2);
		t2.run();
//		t2.start();
		System.out.println("end");
	}

}
