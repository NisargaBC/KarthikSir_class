package com.array.list;

import java.util.ArrayList;
import java.util.LinkedList;

class Mobile
{
	String name;
	float version;
	String colour;
	public Mobile(String name,	float version,	String colour)
	{
		this.name = name;
		this.version = version;
		this.colour = colour;
	}
	
	public String toString()
	{
		return "Mobile name is " +name+ "version is " +version+ "colour is " +colour;
	}
}

class Bottle
{
	String brand;
	int quality;
	int cost;
	
	public Bottle(String brand,	int quality,	int cost)
	{
		this.brand = brand;
		this.quality = quality;
		this.cost = cost;
	}
	
	public String toString()
	{
		return brand+ "qaulity is" +quality+ "cost is " +cost;
	}
}

class Laptop
{
	String brand;
	int ram;
	double cost;
	public Laptop(String brand, int ram, double cost)
	{
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	
	public String toString()
	{
		return brand+ "ram is " +ram+ "cost is " +cost;
	}
}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); // Array is implementation class of list interface
//		LinkedList al = new LinkedList(); // Linkedlist implements list interface and queue interface
		al.add(new Mobile("redme", 2.3f, "blue"));
		al.add(new Bottle("kinly", 1, 10));
		al.add(new Laptop("hp", 4, 450000.00));
		
		al.add(new Mobile("redme", 2.3f, "blue"));
		al.add(new Bottle("kinly", 1, 10));
		al.add(new Laptop("hp", 4, 450000.00));
		
		al.add(new Mobile("redme", 2.3f, "blue"));
		al.add(new Bottle("kinly", 1, 10));
		al.add(new Laptop("hp", 4, 450000.00));
		al.add("java");
		
		System.out.println(al.size());
		
		System.out.println(al.get(9));
		System.out.println("------------");
		for(int i = 0; i<al.size(); i++)
		{
			Object ob = al.get(i);
			System.out.println(ob);
		}
		
		System.out.println("______________");
		
		ArrayList al2 = new ArrayList();
//		ArrayList al2 = new ArrayList(al);

		System.out.println(al2.size());
		for(int i = 0; i<al2.size(); i++)
		{
			Object ob = al2.get(i);
			System.out.println(ob);
		}
	}

}
