package com.libraries.throw_keyword;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start....");
		try
		{
			int a = 1/0;  
			throw new ArithmeticException();
		}
		catch(ArithmeticException ref)
		{
			System.out.println("exception handling");
		}
	}

}
