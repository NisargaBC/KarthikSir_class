package com.libraries.String_class;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("hello"); //helps us to store mutable collection of the characters
		System.out.println("sb= " +sb);
		sb.append("word");
		System.out.println("sb = " +sb);
		sb.append("tesdting");
		System.out.println("sb = " +sb);
		sb.reverse();
		System.out.println("sb =" +sb);
		
//to create the object we have to use new operator we cannot use double quotes
		StringBuilder s1 = new StringBuilder("a");
		StringBuilder s2 = new StringBuilder("a");
		
		System.out.println(s1.toString()); //only toString() method of object class is overriden
		System.out.println(s2.toString());
		System.out.println(s1.hashCode()); // cannot override
		System.out.println(s2.hashCode());
		
	}

}
