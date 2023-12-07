package com.polymophism.one;
// achieving up casting by giving the input argument as class reference variable
class CoreJavaStudent
{
	void coding()
	{
		System.out.println("coding Skills...");
	}
}

class SeleniumStudent extends CoreJavaStudent
{
	void testing()
	{
		System.out.println("testing skills");
	}
}

class Company
{
	void interview(CoreJavaStudent cj)
	{
		cj.coding();
//		cj.testing();
	}
}


public class Program1 {
	public static void main(String[] args) {
		Company c1 = new Company();
//		c1.interview(new CoreJavaStudent()); //matching type casting
		c1.interview(new SeleniumStudent()); // miss matching type casting (up casting)
	}

}
