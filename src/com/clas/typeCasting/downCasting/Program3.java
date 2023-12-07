package com.clas.typeCasting.downCasting;

class Demo11
{
	byte w = 45;
	void data()
	{
		System.out.println("data method...");
	}
}

class Demo12 extends Demo11
{
	float y = 4.5f;
	void run()
	{
		System.out.println("task method...");
	}
}

class Demo13 extends Demo12
{
	boolean out = false;
	void task()
	{
		System.out.println("task method...");
	}
}

public class Program3 {
	public static void main(String[] args) {
		Demo11 d = new Demo13(); // if we execute this line it'll print  all properties of Demo13 means 6 properties
//		Demo11 d = new Demo12(); if we execute this line it'll print only Demo12 properties  means only 4 properties
		d.data();
		System.out.println(d.w);
//		Demo13 d3 = (Demo13)d;
//		d3.data();
//		System.out.println(d3.w);
//		d3.task();
//		System.out.println(d3.out);
//		d3.run();
//		System.out.println(d3.y);
		
		System.out.println("---------");
		
//		Demo11 dd = new Demo12();
//		dd.data();
//		System.out.println(dd.w);		
		Demo12 d2 = (Demo12)d;
		d2.data();
		System.out.println(d2.w);
		d2.run();
		System.out.println(d2.y);
		System.out.println("--------");
		Demo13 dd3 = (Demo13)d2;
		dd3.data();
		System.out.println(dd3.w);
		dd3.task();
		System.out.println(dd3.out);
		dd3.run();
		System.out.println(dd3.y);
		
		Object ob = new Demo12(); // if i run this line, line num 70 will retrive the propertice of only 2 classes (Demo11 and Demo12)
//		Object ob = new Demo13(); //if i run this line, line num 70 will retrive the properties of all 3 classes (Demo11 and Demo12 and Demo13)
//		Demo11 d1 = (Demo11)ob;
//		Demo12 dd2 = (Demo12)d1;
		
		if(ob instanceof Demo13) // instanceof operator checks whether the object is getting which is down casted has relevant class properties.
		{
			Demo12 ref3 = (Demo12)ob;
			System.out.println("downcasting succefull");
		}
		else
		{
			System.out.println("downcasting not successfull");
		}		
	}
}
