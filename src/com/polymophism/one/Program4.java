package com.polymophism.one;



class Hello
{
	void task(Object ob)
	{
		System.out.println("task method....");
	}
	
}

public class Program4 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.task(new SeleniumStudent());
//		h.task(new Object());
		
		
		
	}
}
