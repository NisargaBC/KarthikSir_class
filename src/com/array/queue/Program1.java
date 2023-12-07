package com.array.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Person implements Comparable
{
	String name;
	int age;
	double wealth;	
	public Person(String name,	int age, double wealth	)
	{
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	public String toString()
	{
		return "person " +name+ " and age " +age+ " and wealth " +wealth;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person pr = (Person)o;
		return pr.age - this.age;
	}
	
	
}

class SortByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person pr1 = (Person)o1;
		Person pr2 = (Person)o2;
		String s1 = pr1.name;
		String s2 = pr2.name;
		int value = s1.compareTo(s2);
		return value;
	}
	
}

class SortByWealth implements Comparator
{
		public int compare(Object o1, Object o2)
		{		
		Person pr1 = (Person)o1;
		Person pr2 = (Person)o2;
		return (int)(pr2.wealth - pr1.wealth);
	}
	
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person pr1 = new Person("Amir", 15, 544.32);
		Person pr2 = new Person("Mark", 11, 654.684);
		Person pr3 = new Person("chandh", 82, 448.25);
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(pr1);
		pq.add(pr2);
		pq.add(pr3);
		
		int len = pq.size();
		for(int i=0; i<len; i++)
		{
			Object ob = pq.poll();
			System.out.println(ob);
		}
		
		PriorityQueue pq2 = new PriorityQueue(new SortByName());
		pq2.add(pr1);
		pq2.add(pr2);
		pq2.add(pr3);
		
		int len2 = pq2.size();
		System.out.println("secnd sort");
		for(int i=0; i<len2; i++)
		{
			Object ob2 = pq2.poll();
			System.out.println(ob2);
		}
		
		PriorityQueue pq3 = new PriorityQueue(new SortByWealth());
		pq3.add(pr1);
		pq3.add(pr2);
		pq3.add(pr3);
		
		int len3 = pq3.size();
		System.out.println("secnd sort");
		for(int i=0; i<len3; i++)
		{
			Object ob3 = pq3.poll();
			System.out.println(ob3);
		}
		
	}

}


