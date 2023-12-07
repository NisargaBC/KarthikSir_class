package com.clas.typeCasting;

class DebitCard
{
	long debitnumber = 46546565156L;
	void swipe()
	{
		System.out.println("swipe for transaction");
	}
}

class Bank
{
// when you pass the class reference variable as input argument in the method no need to extend the super class
	void atm(DebitCard ref)
	{
		System.out.println(ref.debitnumber);
		ref.swipe();
		System.out.println("bye");
	}
}

public class Program7 {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.atm(new DebitCard());
	}
}
