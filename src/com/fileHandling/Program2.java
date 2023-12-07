package com.fileHandling;

// To write

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// to write data in file
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pan = "5464645";
		FileWriter fw = null;
		try
		{
//			File f1 = new File("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/"); // if i run this line it will be false b'coz not creating any file
			 fw = new FileWriter("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/data.txt");
			fw.write(pan);
			
			
			System.out.println("file written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
