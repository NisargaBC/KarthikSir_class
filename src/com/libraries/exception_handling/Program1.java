package com.libraries.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the start.........");
		try
		{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("num = " +num); // if enter String instead of entering the number JVM will skip the execution of try block and execute catch block
		System.out.println("hi helooo");
		}
		catch(InputMismatchException ref)
		{
			System.out.println("exception handle....");
		}
		System.out.println("the end....");
		
 	}

}
