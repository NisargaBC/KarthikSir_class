package com.encapsulation.one;

// if we have not written the main method then it will print the out of previous program

public class Pogram1 {
//		the things which are declared as public can be access and it is visible within the class, outside the class, as well as outside the package

	public int a = 15;
	public int b = 45;
	public void test()
	{
		System.out.println("test method");
	}
	
	
/*	Protected access specifier are visible within the class and within the same package.
 and also protected is visible out side the package if we satisfied the following two condition

			1) it should be subclass out side the package. 

			2) we need to create object of subclass and access it.
*/
	protected int c = 74;
	protected void task()
	{
		System.out.println("task method");
	}
	
	
//Default member are visible only with in the package in which they are declared.
	char ch = 'd';
	void run()
	{
		System.out.println("run method");
	}

//	private access specifier are visible only within the same class
	private float s = 1.2f;
	private void data()
	{
		System.out.println("data method");
		System.out.println(s);
	}
	
}
