package com.encapsulation.one;

public class Program6 {
	void test()
	{
		System.out.println("test method....");
	}

}

// if we write the main method outside the class it will execute previous Program
class Dem extends Program6
{
	public static void main(String[] args) {
		System.out.println("test....");
	}
}
