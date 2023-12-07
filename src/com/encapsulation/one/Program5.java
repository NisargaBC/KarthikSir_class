package com.encapsulation.one;

public class Program5 
{
//	we can increase the visibility of the overriden method
	void test()
	{
		System.out.println("test method");
	}
	
	public void run()
	{
		System.out.println("run method");
	}
}

class Demo1 extends Program5
{
	public void test()
	{
		System.out.println("overriden");
	}
	void run()
	{
//		we cannot decrease the visibility of overriden method
		System.out.println("run method");
	}
}