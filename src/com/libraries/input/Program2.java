package com.libraries.input;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner name =new Scanner(System.in);
		System.out.println("eneter senteance");
		String sentance = name.nextLine(); // it reads complete sentance 
		
		System.out.println(sentance);
		
		System.out.println("enter a word");
		String word = name.next(); // it reads only one word
		System.out.println(word);
	}
}
