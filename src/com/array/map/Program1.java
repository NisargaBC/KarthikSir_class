package com.array.map;

import java.util.HashMap;

class Mobile
{
	String name;
	int id;
	double cost;
	Mobile(String name,	int id,	double cost)
	{
		this.name= name;
		this.id = id;
		this.cost = cost;
	}
	
	public String toString()
	{
		return "moblie " +name+ " id " +id+ " cost " +cost;
	}
}

class Laptop
{
	String name;
	int id;
	Laptop(String name,	int id)
	{
		this.name = name;
		this.id = id;
	}
	public String toString()
	{
		return "laptop " +name+ " id " +id;
	}
	
}

class Bottle
{
	String name;
	int id;
	Bottle(String name,	int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return "bottel " +name+ " id " +id;
	}
}



public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		
		Mobile m1 =new Mobile("nokia", 5444, 456.45);
		
		hm.put("m1", new Laptop("ios", 45));
		
		Object ob = hm.get("m1");
		System.out.println(" output " +ob);
		
		hm.put("key2", new Bottle("kinly", 545));
		
		Object ob2 = hm.get("key2");
		System.out.println("o/p2 " +ob2);
		
		hm.put("key", new Laptop("windows", 64));
		Object ob3 = hm.get("key");
		System.out.println(" o/p3 " +ob3);
		
	}

}
