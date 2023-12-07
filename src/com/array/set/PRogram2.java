package com.array.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class PRogram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();

		hs.add("test");
		hs.add("Java");
		hs.add("test");
		hs.add("Test");
		hs.add("web");
		hs.add("java");
		hs.add("Test_engineer");
		
		Iterator ref = hs.iterator();
		while(ref.hasNext())
		{
			Object ob = ref.next();
			System.out.println(ob);
		}
	}

}
