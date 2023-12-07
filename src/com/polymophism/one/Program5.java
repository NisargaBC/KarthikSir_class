package com.polymophism.one;

class BrainDay1
{
	void coreJava()
	{
		System.out.println("java is very difficulty");
		System.out.println("non IT cannot learn");
	}
}

class BrainToday extends BrainDay1
{
	void coreJava()
	{
		System.out.println("java is easy and interest");
		System.out.println("login and escape ");
	}
}

public class Program5 {
	public static void main(String[] args) {
		BrainDay1 ref = new BrainToday();
		ref.coreJava();
	}
}
