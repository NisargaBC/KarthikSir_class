package com.libraries.throw_keyword;

import java.io.IOException;
import java.sql.SQLException;

class Department
{
	void forcast() throws IOException, InterruptedException, SQLException
	{
		System.out.println("forcast the weather");
		
	}
}



public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dt = new Department();
		try
		{
			dt.forcast();
		}
		catch(IOException e)
		{
			System.out.println("it is raining use umbrella");
		}
		catch(InterruptedException e)
		{
			System.out.println("interuptedException....");
		}
		catch(SQLException e)
		{
			System.out.println("sql exception....");
		}
		System.out.println("end");
	}

}
