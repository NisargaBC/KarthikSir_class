package com.polymophism.one;

class Father
{
	void house() {
		System.out.println("old 1987 house");
	}
}

class Son extends Father
{
//	 when we call over ridden method using up casting reference variable we get the out put of sub class implementation and 
	
	void house() 
	{
		System.out.println("new house");
	}
	
//	it will hide the properties when there is no override
	void Car()
	{
		System.out.println("new car");
	}
}

public class Program6 {
	public static void main(String[] args) {
		Father s = new Son();
		s.house();
//		s.Car();
		
	}
}
