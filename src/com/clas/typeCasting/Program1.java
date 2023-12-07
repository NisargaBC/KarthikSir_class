package com.clas.typeCasting;

class Demo1
{
	
}

class Demo2 extends Demo1
{
	
}


public class Program1 {
//	matching type casting statement
	Demo1 d1 = new Demo1();
	Demo2 d2 = new Demo2();
// miss matching type casting statment 	
	Demo1 de1 = new Demo2(); //up casting 
//	Demo2 de2 = new Demo1(); // down casting wrong to perform downcasting we need to perform upcasting first
}
