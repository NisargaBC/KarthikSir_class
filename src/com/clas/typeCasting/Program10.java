package com.clas.typeCasting;

class Car
{
	void engine()
	{
		System.out.println("engine");
	}
}

class You1  extends Car
{
//	void travel()
	void travel(Car c)
	{
		c.engine();
		System.out.println("happy jurny");
	}
}

public class Program10 
{
	public static void main(String[] args) {
		You1 y = new You1();
//		y.travel();
//		y.engine();
//		y.travel(new Car());
      y.travel(new You1());
		
	}
}
