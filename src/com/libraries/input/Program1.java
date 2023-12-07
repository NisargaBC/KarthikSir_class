package com.libraries.input;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("enter number");
		long contactNumber =  ref.nextLong();
		System.out.println(contactNumber);
		
		System.out.println("enter amount");
		double amt = ref.nextDouble();
		System.out.println(amt);
	}
}
