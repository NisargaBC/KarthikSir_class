package com.libraries.object_class;

class Application
{
/*	in java it impossible to know the address of object if we print reference variable using System.out.println();
	then we will not get address we will get toString() output.
	*/
}
class Version
{
	public int hashCode()
	{
		return 35465465;
	}
	
	public String toString()
	{
		return "hi hello";
	}
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application ref = new Application();
		int value = ref.hashCode();
		System.out.println(value);
		Application ref2 = new Application();
		int value2 = ref2 .hashCode();
		System.out.println(value2);
		
		String res1 = ref.toString();
		System.out.println(res1);
		String res2 = ref2.toString();
		System.out.println(res2);
		
		Version v = new Version();
		int value3 = v.hashCode();
		System.out.println(value3);
		
		String res3 = v.toString();
		System.out.println(res3);
	}

}
