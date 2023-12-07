package com.array.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		
		al.add(new Mobile("redme", 2.3f, "blue"));
		al.add(new Bottle("kinly", 1, 10));
		al.add(new Laptop("hp", 4, 450000.00));
		
		Iterator ref = al.iterator(); // iterator is an interface
//		Object ob = ref.next();
//		System.out.println(ob);
//		Object ob2 = ref.next();
//		System.out.println(ob2);
//		Object ob3 = ref.next();
//		System.out.println(ob3);
		
		while(ref.hasNext())
		{
			Object ob = ref.next(); // 	this method retrive the next object from the collection
			System.out.println(ob);
		}
		
		System.out.println("out put for each loop");
		
		for(Object ob : al) // for each loop internally make use of iterator
		{
			System.out.println(ob);
		}


	}

}

