package com.clas.typeCasting.downCasting;

class FlightInair
{
	void wings()
	{
		System.out.println("fly in air...");
	}
}

class FlightonLand extends FlightInair
{
	void wheels()
	{
		System.out.println("wheels on ground...");
	}
}

public class Program2 {
	public static void main(String[] args) {
		
		FlightInair takeoff = new FlightonLand(); // up casting
		takeoff.wings();
		
		FlightonLand landing = (FlightonLand)takeoff;
//		FlightonLand ref = (FlightonLand)new FlightInair(); with direct down casting we cannot achieve the down casting 
		landing.wings();
		landing.wheels();
	}
}
