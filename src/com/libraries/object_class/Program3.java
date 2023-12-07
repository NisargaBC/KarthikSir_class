package com.libraries.object_class;

class CurrencyNote
{
	String colour;
	int serial;
	int value;
	public CurrencyNote(String colour, int serial, int value)
	{
		this.colour = colour;
		this.serial = serial;
		this.value =value;
	}
	
	public boolean equals(Object ob)
	{
		CurrencyNote ct = (CurrencyNote)ob;
		return this.serial == ct.serial;
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyNote c1 = new CurrencyNote("pink", 12345567, 500);
		CurrencyNote c2 = new CurrencyNote("pink", 12345567, 500);
		System.out.println(c1==c2);
		
		boolean out = c1.equals(c2); //to compare two different object in java it is recommended to use (.equals method)
		System.out.println("out = " +out);
//		hence it is recommended to override equals method to compare content of the object to decide duplicate.
	}

}
