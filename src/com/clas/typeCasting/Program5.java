package com.clas.typeCasting;

class Version1
{
	int a = 24;
	void test()
	{
		System.out.println("test method...");
	}
}

class Version2 extends Version1
{
	double b = 12.65;
	void run()
	{
		System.out.println("run method...");
	}
}

public class Program5 {
public static void main(String[] args) {
	Version2 v2 = new Version2();
	System.out.println(v2.a);
	v2.test();
	System.out.println(v2.b);
	v2.run();
	
	System.out.println("-----");
	
//hiding the properties of subclass ==> upcastting	
	Version1 v1 = v2;
	System.out.println(v1.a);
	v1.test();
	
	
}
}
