package com.libraries.exception_handling;
// Propagation of exception
class Constracter
{
	void constructRoad()
	{
		System.out.println("constructor road....");
//		try
//		{
			int a = 1/0; // risky code
//		}
//		catch(ArithmeticException ref)
//		{
//			System.out.println("constructor handle the exception");
//		}
	}
}

class Minister
{
	void develop()
	{
		System.out.println("minister does development");
		Constracter ref = new Constracter();
//		try
//		{
			ref.constructRoad();
//		}
//		catch(ArithmeticException ref)
//		{
//			System.out.println("constructor handle the exception");
//		}
		
		
	}
}

class ChiefMinister
{
	void runGoverment()
	{
		System.out.println("cheif mistor eill run goverment");
		Minister min = new Minister();
//		try
//		{
			min.develop();
//		}
//		catch(ArithmeticException ref)
//		{
//			System.out.println("handle exception...");
//		}
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("people will create cheif minister");
		ChiefMinister cm = new ChiefMinister();
//		try
//		{
			cm.runGoverment();
//		}
//		catch(ArithmeticException ref)
//		{
//			System.out.println("people handel the exception");
//		}
	}

}
