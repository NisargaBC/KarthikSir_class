package com.abstraction.one;
//Generalize the common properties of the classes and store it in a interface 
interface Zomato
{
	void menu();
	void order();
	void deliver();
}


// Provide the implementation for the abstract method present in a interface inside implementation class.
class Mcdonals implements Zomato
{
	public void menu()
	{
		System.out.println("welcome to mcdonalods");
		System.out.println("burgers and meals");
	}
	public void order()
	{
		System.out.println("collect the order from customer");
		System.out.println("generate the order number");
		System.out.println("prepare the order");
	}
	public void deliver()
	{
		System.out.println("deliver the order to customer");
	}
}

class Domios implements Zomato
{
	public void menu()
	{
		System.out.println("welcome to dominos");
		System.out.println("piza");
	}
	public void order()
	{
		System.out.println("collect the order from customer dominos");
		System.out.println("generate the order number dominos");
		System.out.println("prepare the order domiinos******");
	}
	public void deliver()
	{
		System.out.println("deliver the order to customer dominos_________");
	}
}

class AdyarBhavan implements Zomato
{
	public void menu()
	{
		System.out.println("welcome to Adyabhavan");
		System.out.println("burgers and meals southindian+++++++");
	}
	public void order()
	{
		System.out.println("collect the order from customer $$$$");
		System.out.println("generate the order number$$$$$$");
		System.out.println("prepare the order$$$$");
	}
	public void deliver()
	{
		System.out.println("deliver the order to custome######r");
	}
}


class ZomatoApp // create object of implementation class and store it in interface reference variable.
{
	Zomato onlineOrder(char select)
	{
		if(select == 'm')
		{
			return new Mcdonals();
		}
		else if(select == 'd')
		{
			return new Domios();
		}
		else
		{
			return new AdyarBhavan();
		}
	}
}

public class Program1 {
	public static void main(String[] args) {
		System.out.println("this is user....");
// Access the implementation class methods using interface reference variable.
		ZomatoApp app1 = new ZomatoApp();
		Zomato zt = app1.onlineOrder('d'); // up casting 
		zt.menu();
		zt.order();
		zt.deliver();
		
	}
}
