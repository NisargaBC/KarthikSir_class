package com.fileHandling;

import java.io.File;
import java.io.IOException;

// To create file

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/"); // if i run this line it will be false b'coz not creating any file
//		File f1 = new File("C:/Users/Admin/Desktop/QSpider_nisarga/java/FileHandling/new.java");

		try
		{
			boolean res = f1.createNewFile();
			System.out.println("file creaste = " +res);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
