package com.array.one;

class Student
{
	String name;
	int ratings;
	long contactNumber;
	String emailId;
	Student(String name, int ratings, long contactNumber,	String emailId)
	{
		this.name = name;
		this.ratings = ratings;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}
	
	public String toString()
	{
		return name+ " " +ratings+ " " +contactNumber+ " " +emailId;
	}
}

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] ar = new Student[4];
		ar[0] = new Student("xyz", 2, 9745856587L, "xyz@gmai.com" );
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
