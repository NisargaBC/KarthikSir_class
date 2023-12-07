package com.array.one;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ar = {"java", "sql", "web"};
		System.out.println(ar.length);
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("main method arguments");
		System.out.println(args.length);
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		
	}

}
