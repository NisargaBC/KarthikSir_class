package com.libraries.throw_keyword;

import java.io.IOException;

class Developer
{
	void coding() throws IOException
	{
		System.out.println("coding...");
		throw new IOException();
//		try
//		{
//			
//		}
	}
}

class TeamLead
{
	void team() throws IOException
	{
		System.out.println("handle the team");
		Developer dv = new Developer();
		dv.coding();
	}
}

class ProjectManager
{
	void handleProject() throws IOException
	{
		System.out.println("handle project...");
		
		TeamLead tl = new TeamLead();
		tl.team();
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProjectManager pm = new ProjectManager();
		try
		{
			pm.handleProject();
		}
		catch(IOException ref)
		{
			System.out.println("io exception....");
		}

	}

}
