package com.fileHandling;
// To read the file data

import java.io.FileReader;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
	//  create input and character stream and pass the location of the file where the data has to be stored in the form of string

			FileReader fr = new FileReader("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/data.txt");
			int a = fr.read(); // call the below inbuilt method to read the data
			while(a!= -1)
			{
				System.out.print((char)a); // read method will return the unicode of 1 character at a time 

				a= fr.read();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
