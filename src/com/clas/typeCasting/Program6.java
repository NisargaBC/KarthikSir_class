package com.clas.typeCasting;

class Sample1
{
	int a= 546;
	void test()
	{
		System.out.println("test method...");
	}
}

class Sample2 extends Sample1
{
	char ch = 'A';
	void task()
	{
		System.out.println("task method...");
	}
}

class Sample3 extends Sample2
{
	double d = 45.254;
	void run()
	{
		System.out.println("run method");
	}
}

public class Program6 {
	public static void main(String[] args) {
		Sample3 s3 = new Sample3();
		System.out.println(s3.a);
		s3.test();
		System.out.println(s3.ch);
		s3.task();
		System.out.println(s3.d);
		s3.run();
		System.out.println("------");
		Sample2 s2 = s3;
		System.out.println(s2.a);
		s2.test();
		System.out.println(s2.ch);
		s2.task();
		
		System.out.println("------");
		
		Sample1 s1 = s2;
		
		System.out.println(s1.a);
		s1.test();
		
		System.out.println("-------");
		Sample1 s = s3;
		System.out.println(s.a);
		s.test();
		
		Object ref = new Sample3();
		System.out.println(ref.equals(25));
		
		
	}
}
