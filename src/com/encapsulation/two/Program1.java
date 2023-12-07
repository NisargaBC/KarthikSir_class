package com.encapsulation.two;

class AdharCard 
{
	private long adharNumber;
	private int age;
	private String name;
	public AdharCard(long adharNumber, int age, String name)
	{
		this.adharNumber =adharNumber;
		this.age = age;
		this.name = name;
	}
	
	public long getAdharNumber()
	{
		System.out.println("generate and validate otp");
		return adharNumber;
	}
	
	public int getAge()
	{
		System.out.println("generate and validate otp");
		return age;
	}
	
	public String getName()
	{
		System.out.println("generate and validate otp");
		return name;
	}
	
	public void setAdharNum(long adharNumber)
	{
		System.out.println("generate and validate otp");
		this.adharNumber =adharNumber;
		System.out.println("update successfully");
	}
	
	public void setAge(int age)
	{
		System.out.println("generate and validate otp");
		this.age = age;
		System.out.println("update successfully");
	}
	
	public void setName(String name)
	{
		System.out.println("generate and validate otp");
		this.name =name;
		System.out.println("update successfully");
	}
}

public class Program1
{
	public static void main(String[] args) {
		System.out.println("this goverment ");
		AdharCard a = new AdharCard(74512654644L, 18, "nibba");
		
		long adharNum = a.getAdharNumber();
		System.out.println(adharNum);
		
//		a.getAdharNumber();
		
		int ag = a.getAge();
		System.out.println("age = " +ag);
		
		String n = a.getName();
		System.out.println("Name = " +n);
		
		a.setAdharNum(65464621215L);
		long adharNum2 = a.getAdharNumber();
		System.out.println(adharNum2);
		
		a.setAge(25);
		int ag1 = a.getAge();
		System.out.println(ag1);
		
		a.setName("mark");
		String n1 = a.getName();
		System.out.println(n1);
	}
}
