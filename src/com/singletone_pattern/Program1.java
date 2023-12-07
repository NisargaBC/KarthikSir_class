package com.singletone_pattern;

class DataBase
{
	private static DataBase ref =null;
	private DataBase() // declare the constructor private
	{
		System.out.println("database created");
	}
	 void storeData(String data)
	{
		System.out.println("store the data = " +data);
	}
	 public static DataBase getDataBase() //declare a static method which returns object of same class
	 {
		 // write a logic inside static method to create only one object for the class  
		 if(ref== null)
		 {
			 ref = new DataBase();
		 }
		 return ref;
	 }
	 
}

public class Program1 {
	public static void main(String[] args) {
		DataBase db = DataBase.getDataBase();
		db.storeData("adharcard = 2323bjbjb23232");
		DataBase db2 = DataBase.getDataBase();
		db2.storeData("pan = 337ggd37y37gv323");
		DataBase db3 = DataBase.getDataBase();
		db3.storeData("account = kj144441");
		
	}

}
