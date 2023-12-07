package com.wrapper;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "12345";
		System.out.println("s1 " +s1);
		
		int num1 = Integer.parseInt(s1);
		System.out.println(num1);
		
		String s2 = "12354.6564";
		System.out.println("s2 " +s2);
		
		double d = Double.parseDouble(s2);
		System.out.println("d " +d);
		
		int a = 45;
		System.out.println(Integer.toString(a));
		
		char ch = '9';
		
		System.out.println(Integer.parseInt(String.valueOf(ch)));
		
	}

}
