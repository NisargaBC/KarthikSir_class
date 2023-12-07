package com.libraries.String_class;

public class Program1 {
// String class is present java.lang and declared as final
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		it is a immutable class
		String name = "jhon";
		System.out.println("name= " +name);
		String another = name;
		System.out.println("another= " +another);
		
		name = "mark";
		System.out.println("name =" + name);
		System.out.println("another = " +another);
		
		
	/*
	 String class object can be created in two ways 
	==> using double quotes
	==> new operator
	*/
		String s1 = "java";
		System.out.println("s1 = " +s1);
		
		String s2 = new String();
		System.out.println("s2 = " +s2);
		
		String s3 = new String("hello");
		System.out.println("s3 = " +s3);
		
//		in string class 3 methods of object class is overridden
		System.out.println(s1.toString());
		System.out.println(s3.toString());
		
		String s4 = "Abc";
		String s5 = new String ("Abc");
		
		System.out.println(s4.hashCode()); // it can overridden
		System.out.println(s5.hashCode());
		
		System.out.println(s4 == s5);
		boolean out1 = s4.equals(s5);
		System.out.println(out1);
		
		
		
		String j1 = "java"; // constant object
		System.out.println("j1 = " +j1);
		
		String j2 = new String("java"); // non constant
		System.out.println("j2 = " +j2);
		
		String j3 = "java"; // duplicate not allowed in constant object
		System.out.println("j3 = " +j3);	
		
		
	}

}
