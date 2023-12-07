package com.fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
// DeSerialization
public class Program5 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
// create an object of FileInputStream and pass the location of the file as constructor argument
			FileInputStream in = new FileInputStream("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/data.txt");
// create an object of ObjectInputStream and pass the InputStream as constructor argument
			ObjectInputStream fIn = new ObjectInputStream(in);
//call the method which will convert and transfer	
			Object ob = fIn.readObject();
			System.out.println(ob);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
