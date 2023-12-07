package com.array.one;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java development";		
		char [] ch = str.toCharArray();
		for(int i=0; i< ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		String s1 = "hi how are you";
		System.out.println(s1);
		String [] ar = s1.split(" ");
		for(int i =0; i< ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		
		char [] t = {'h', 'e', 'l', 'l', 'o'};
		String s2 = new String(t);
		System.out.println(s2);
	}

}
