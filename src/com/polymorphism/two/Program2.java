package com.polymorphism.two;
class Trai
{
	void ProvideInternet()
	{
		System.out.println("network signal...");
	}
}

class AirtelXtream extends Trai
{
	void ProvideInternet()
	{
		System.out.println("Airtel xtream network");
	}
}

class JioFibre extends Trai
{
	void ProvideInternet()
	{
		System.out.println("jio network");
	}
}

class Bsnl extends Trai
{
	void ProvideInternet()
	{
		System.out.println("BSNL network");
	}
}

class Router
{
	void signalreciever(Trai ref)
	{
		ref.ProvideInternet();
	}
}
public class Program2 {
	public static void main(String[] args) {
		Router rt = new Router();
		rt.signalreciever(new Bsnl());
		rt.signalreciever(new JioFibre());
		rt.signalreciever(new AirtelXtream());
		
	}
}
