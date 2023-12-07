package com.libraries.String_class;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "DEvLopMent";
		System.out.println("s1 =" +s1);
		
		int out = s1.length();
		System.out.println(out);
		
		char ch = s1.charAt(5);
		System.out.println(ch);
		
		String answer1 = s1.toLowerCase();
		System.out.println(answer1);
		
		String answer2 = s1.toUpperCase();
		System.out.println(answer2);
		
		int a1 = s1.indexOf('M');
		System.out.println(a1);
		int a2 = s1.indexOf('e', 3);
		System.out.println(a2);
		
		String res = s1.substring(5);
		System.out.println(res);
		
		String res1 = s1.substring(3,5);
		System.out.println(res1);
		
		
	}
	

}
