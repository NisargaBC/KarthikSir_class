package com.array.set;

import java.util.HashSet;
import java.util.Iterator;



public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		hs.add("B");
		hs.add("e");
		hs.add("B");
		hs.add("c");
		
		Iterator ref = hs.iterator();
		while(ref.hasNext())
		{
			Object ob = ref.next();
			System.out.println(ob);
		}
	}

}
