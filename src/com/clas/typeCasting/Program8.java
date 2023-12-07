package com.clas.typeCasting;

class Laptop
{
	boolean internet = true;
	void browser(String link)
	{
		System.out.println("connect to link");
	}
}

class You
{
	void onlineSession(Laptop l)
	{
		System.out.println(l.internet);
		l.browser("kjnkdjnf");
	}
}

public class Program8 {
	public static void main(String[] args) {
		You ref = new You();
		ref.onlineSession(new Laptop());
	}
}
