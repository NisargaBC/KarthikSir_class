package com.array.set;

import java.util.HashSet;
import java.util.Iterator;



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
	
	public String toString()
	{
		
		return "currency note colour" + colour+ " serial number " +serial+ " amount is " +value;
	}
	
	public int hashCode()
	{
		return serial;
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
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		HashSet hs = new HashSet();
		hs.add(c1);
		hs.add(c2);
		
		System.out.println(hs.size());
		Iterator ref = hs.iterator();
		while(ref.hasNext())
		{
			Object ob = ref.next();
			System.out.println(ob);
		}
	}

}
