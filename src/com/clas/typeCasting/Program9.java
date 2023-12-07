package com.clas.typeCasting;

class NoteBook
{
	void ProvidePages()
	{
		System.out.println("Provide pages");
	}
}

class Pen
{
	void provideInk()
	{
		System.out.println("provide ink");
	}
}

class Student
{
	void writeNote(NoteBook n, Pen p)
	{
		n.ProvidePages();
		p.provideInk();
	}
}

public class Program9 
{
	public static void main(String[] args) 
	{
	Student s = new Student();
	s.writeNote(new NoteBook(), new Pen());
	}
}
