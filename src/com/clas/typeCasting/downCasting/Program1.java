package com.clas.typeCasting.downCasting;

class Ver1
{
	int a = 12;
	void test()
	{
		System.out.println("test method");
	}
}

class Ver2 extends Ver1
{
	double b = 1.2;
	void run()
	{
		System.out.println("run method...");
	}
}

public class Program1 {
	public static void main(String[] args) {
//we cannot perform direct down casting 
		Ver1 v = new Ver2();
		System.out.println(v.a);
		v.test();
// to achieve the down casting we need to write the up casting is mandatory		
		Ver2 v2 = (Ver2)v;
		System.out.println(v2.a);
		v2.test();
		System.out.println(v2.b);
		v2.run();
//		Ver2 v =(Ver2)new Ver1(); this is direct down casting we cannot achieve down casting with this
	}
}
