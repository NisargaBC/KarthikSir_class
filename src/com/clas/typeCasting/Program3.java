package com.clas.typeCasting;

class Politician
{
	void innocent()
	{
		System.out.println("inocent");
	}
	void acting() {
		System.out.println("great acting");
	}
}

class HumanBeing extends Politician
{
	void attitude()
	{
		System.out.println("attitude");
	}
	void anger()
	{
		System.out.println("anger behavior");
	}
}
public class Program3 
{
public static void main(String[] args) {
//	when there is a up casting, it's going to hide the behavior of subclass
	Politician p = new HumanBeing();
	p.innocent();
	p.acting();
	
}
}
