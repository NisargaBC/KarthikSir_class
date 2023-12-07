package com.libraries.throw_keyword;

class NotEligibleException extends Exception}
{
	
}

class HrRegistration
{
	void register(boolean mock) throws NotEligibleException
	{
		System.out.println("register for the mock");
		if(mock == true)
		{
			System.out.println("proced with registration");
		}
		else
		{
			throw new NotEligibleException();
		}
	}
}

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrRegistration hr = new HrRegistration();
		try
		{
			hr.register(true);
		}
		catch(NotEligibleException e)
		{
			System.out.println("take the mock and register");
		}
	}

}
