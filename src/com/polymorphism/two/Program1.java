package com.polymorphism.two;

class Zara
{
	void buyingcloths()
	{
		System.out.println("pay the original price ");
	}
}

class Myntra extends Zara
{
	void buyingcloths()
	{
		System.out.println("buy with 30% off");
	}
}

class Ajio extends Zara
{
	void buyingcloths()
	{
		System.out.println("buy with 60% off");
	}
}

class Me
{
	void shopping(Zara ref)
	{
		ref.buyingcloths();
	}
}

public class Program1 {
	public static void main(String[] args) {
		Me user1 = new Me();
		user1.shopping(new Ajio());
		user1.shopping(new Myntra());
//		user1.shopping(new Zara());
	}
}
