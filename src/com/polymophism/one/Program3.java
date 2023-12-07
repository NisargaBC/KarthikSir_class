package com.polymophism.one;

class GeneralTicket
{
	void travel()
	{
		System.out.println("travel...");
	}
}

class ReservedTicke extends GeneralTicket
{
	void seat()
	{
		System.out.println("reserved seat");
	}
	void food()
	{
		System.out.println("we can order food");
	}
}

class AcTicket extends ReservedTicke
{
	void conntrol()
	{
		System.out.println("complete facilities");
	}
}

class Train
{
	void generalCompartment(GeneralTicket g)
	{
		g.travel();
	}
	
	void reservedCompartment(ReservedTicke r)
	{
		r.seat();
		r.food();
	}
	
	void acCompartment(AcTicket a)
	{
		a.conntrol();
	}
}

public class Program3 {
	public static void main(String[] args) {
		Train t = new Train();
		t.generalCompartment(new GeneralTicket()); // matching type casting or same class object
		t.generalCompartment(new ReservedTicke()); // miss matching (up casting) type casting and here we can pass the sub class object as input
		t.generalCompartment(new AcTicket());
		
//		t.reservedCompartment(new GeneralTicket()); here we cannot pass the super class object as input 
		t.reservedCompartment(new ReservedTicke()); // matching type casting or same class object
		t.reservedCompartment(new AcTicket());  // miss matching (up casting) type casting and here we can pass the sub class object as input
		
//		t.acCompartment(new GeneralTicket());
//		t.acCompartment(new ReservedTicke());
		t.acCompartment(new AcTicket());   // matching type casting or same class object
		
	}
}
