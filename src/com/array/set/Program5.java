package com.array.set;

import java.util.Comparator;
import java.util.PriorityQueue;

class Person implements Comparable
{
	String name;
	String place;
	int age;
	public Person(String name, String place, int age)
	{
		this.name = name;
		this.place = place;
		this.age = age;
	}
	
	public String toString()
	{
		return name+ " " +place+ " " +age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		return this.age-p.age;
	}
}

class SortByName implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Person pr1 = (Person)o1;
		Person pr2 = (Person)o2;
		String s1 = pr1.name;
		String s2 = pr2.name;
		int out = s1.compareTo(s2);
		return out;
	}
	
}


public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("ambrapali", "hidenPlace", 45);
		Person p2 = new Person("chasmish", "space", 12);
		Person p3 = new Person("amrutha", "ita", 84);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		
		int length = pq.size();
		System.out.println(length);
		
		for(int i= 0; i<length; i++)
		{
			Object ob = pq.poll();
			System.out.println(ob);
		}
		
		PriorityQueue pq1 = new PriorityQueue(new SortByName());
		pq1.add(p1);
		pq1.add(p2);
		pq1.add(p3);
		
		int length1 = pq1.size();
		System.out.println(length);
		
		for(int i= 0; i<length1; i++)
		{
			Object ob1 = pq1.poll();
			System.out.println(ob1);
		}
	}

}
