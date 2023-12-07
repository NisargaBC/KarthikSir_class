package com.libraries.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("the start...");
			int num1 = sc.nextInt();			
			System.out.println("num1 = " +num1);
			System.out.println("enetr the second number");
			int num2 = sc.nextInt();
			System.out.println("num2 = " +num2);
			int div = num1/num2;
			System.out.println("div = " +div);
		}
		
		catch(ArithmeticException ref)
		{
			System.out.println("Arithmetic exception");
		}
		catch(InputMismatchException ref)
		{
			System.out.println("input execption handle");
		}
		catch(Exception ref)
		{
			System.out.println(" generic exception....");
		}
		
		System.out.println("the end....");
	}
}
