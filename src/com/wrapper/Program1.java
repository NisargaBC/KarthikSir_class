package com.wrapper;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 56;
		System.out.println(a);
		
		
		
		Integer ref = 65; //boxing
		System.out.println(ref);
		
		int num1 = ref; // un boxing
		System.out.println(num1); 
		
		Float b = 4.5f; //boxing
		System.out.println(b.toString());
		
		float f = b; // unboxing
		System.out.println(f);
		
		Boolean b1 = true;
		System.out.println(b1.toString());
		
		Character c = 's';
		System.out.println(c);
	}

}
