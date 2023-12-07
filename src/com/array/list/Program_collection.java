package com.array.list;

import java.util.ArrayList;

public class Program_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile> al = new ArrayList(); //<> to make genrics
		al.add(new Mobile("redme", 2.3f, "blue"));
//		al.add(new Bottle("kinly", 1, 10));
//		al.add(new Laptop("hp", 4, 450000.00));
		
		for(Mobile m : al)
		{
			System.out.println(m);
		}
	}

}
