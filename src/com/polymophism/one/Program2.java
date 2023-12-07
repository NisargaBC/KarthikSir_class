package com.polymophism.one;

class NormalPass
{
	void entry()
	{
		System.out.println("enter to watch");
	}
}

class VipPass extends NormalPass
{
	void seat()
	{
		System.out.println("seating arrangement");
	}
	
	void complimentaryFood()
	{
		System.out.println("complementary food");
	}
}

class LiveEvent
{
	void gate1(NormalPass np)
	{
		np.entry();
	}
	
	void gate2(VipPass vp)
	{
		vp.entry();
		vp.seat();
		vp.complimentaryFood();
	}
}

public class Program2 {
	public static void main(String[] args) {
		LiveEvent l = new LiveEvent();
		l.gate1(new NormalPass()); // matching type casting 
	
		System.out.println("----------");
		
		l.gate2(new VipPass()); // matching type casting
		
		System.out.println("--------");
		
		l.gate1(new VipPass()); // miss matching (up casting) type casting and here we can pass the sub class object as input 
		
//		l.gate2(new NormalPass());   here we cannot pass the super class object as input  
	}
}
