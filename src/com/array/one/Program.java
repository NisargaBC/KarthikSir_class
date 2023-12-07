package com.array.one;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] ar = new String[5];
//		ar[0] = 12;
//		ar[1] = 23;
//		ar[2] = 56;
//		ar[3] = 5;
//		ar[4] = 7;
		
		ar[0] = "welcome";
		ar[1] = "to";
		ar[2] = "java";
		ar[3] = " and";
		ar[4] = "learn";
//		int [] ar = {9, 8, 7, 6, 5};
		
		String [] ar1 = {"n", "b", "c", "s", "v"};	
		
		String s1 = "welcome to java";
		
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		
		
		System.out.println(s2.reverse());
		
		for(int i= ar.length-1 ;  i>=0; i--)
		{
			System.out.print(ar[i]);
		}
	}

}
