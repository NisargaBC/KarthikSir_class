package com.libraries.exception_handling;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("join java course...");
		try
		{
		System.out.println("login to class on time");
		System.out.println("interact in class");
		System.out.println("practice everyday");
		System.out.println("attend mock interview");
		Scanner sc = new Scanner(System.in);
		System.out.println("the start...");
		int num1 = sc.nextInt();			
		System.out.println("num1 = " +num1);
		if(num1 == 1)
		{
			System.out.println("perform well...");
		}
		else
		{
			int a = 1/num1;
		}
		
		
		}
		catch(ArithmeticException ref)
		{
			System.out.println("not perform well in mock interview");
			System.out.println("attend another java batch");
			System.out.println("take care not repeating same");
			System.out.println("attend the remock");
		}
		
		finally
		{
			System.out.println("get interview bansed on mock performance");
			System.out.println("clear interview get placed");
		}
		System.out.println("the end...");
	}

}
