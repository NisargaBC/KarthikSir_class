package com.clas.typeCasting;

class StudentinClass
{
	void kamalassan()
	{
		System.out.println("oscar level acting");
	}
}

class StudentOutSideClass extends StudentinClass
{
	void normalBehaviour()
	{
		System.out.println("normal life");
	}
}

public class Program4 
{
	public static void main(String[] args) {
		StudentinClass s = new StudentOutSideClass();
		s.kamalassan();
		
		
	}
}
