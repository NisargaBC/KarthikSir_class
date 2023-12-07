package com.array.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Product implements  Comparable
{
	String name;
	int id;
	double cost;
	public Product(String name,	int id,	double cost)
	{
		this.name = name;
		this.id = id;
		this.cost = cost;
	}
	
	public String toString()
	{
		return "Product " +name+ " id " +id+ " cost " +cost;
	}
	
	public int compareTo(Object ob)
	{
		Product pt = (Product)ob;
//		return pt.id-this.id;
//		return (int)(pt.cost - this.cost);
		String s1 = this.name;
		String s2 = pt.name;
		int value = s1.compareTo(s2);
		return value;
	}
	
}

class SortBasedOnId implements Comparator
{	
	public int compare(Object o1, Object o2) {
		Product pt1 = (Product)o1;
		Product pt2 = (Product)o2;
		return pt1.id - pt2.id;
	}
	
}

class SortBasedOnCost implements Comparator
{
	public int compare(Object o1, Object o2) {
		Product pt1 = (Product)o1;
		Product pt2 = (Product)o2;
		return (int)(pt1.cost - pt2.cost);
		
	}
	
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("tshirt", 2312, 34.54);
		Product p2 = new Product("mobile", 54654, 456664.656);
		Product p3 = new Product("laptop", 546, 544.6546);
		TreeSet ts = new TreeSet();
		ts.add(p1); // this add is internally depends on compareTo()
		ts.add(p2);
		ts.add(p3);
		System.out.println(ts.size());
		
		Iterator ref = ts.iterator();
		while(ref.hasNext())
		{
			Object ob = ref.next();
			System.out.println(ob);
		}
		
		TreeSet ts2 = new TreeSet(new SortBasedOnId());
		ts2.add(p1); // this add is internally depends on compareTo()
		ts2.add(p2);
		ts2.add(p3);
		System.out.println(ts2.size());
		
		Iterator ref2 = ts2.iterator();
		while(ref2.hasNext())
		{
			Object ob1 = ref2.next();
			System.out.println(ob1);
		}
		
		
		TreeSet ts3 = new TreeSet(new SortBasedOnCost());
		ts3.add(p1); // this add is internally depends on compareTo()
		ts3.add(p2);
		ts3.add(p3);
		System.out.println(ts3.size());
		
		Iterator ref3 = ts3.iterator();
		while(ref3.hasNext())
		{
			Object ob2 = ref3.next();
			System.out.println(ob2);
		}
	}

}
