package com.fileHandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class PanCard  implements Serializable
{
	String name;
	String panNumber;
	long contactNumber;
	public PanCard(String name,	String panNumber, long contactNumber)
	{
		this.name = name;
		this.panNumber = panNumber;
		this.contactNumber = contactNumber;
	}
	
	public String toString()
	{
		return " name " +name+ "panCard number " +panNumber+  " cantactNumber " +contactNumber;
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanCard p = new PanCard("abcd", "168768jhvh254", 7412365489L);
		try
		{
// create an object of fileOutputStream and pass the location of the file as constructor argument
			FileOutputStream out = new FileOutputStream("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/data.txt");
// create an object of objectOutputStream and pass the outputStream as constructor argument
			ObjectOutputStream fout = new ObjectOutputStream(out);
			
			fout.writeObject(p); // call the method which will convert and transfer
			System.out.println("object written");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
