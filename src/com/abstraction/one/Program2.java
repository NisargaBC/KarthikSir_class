package com.abstraction.one;

interface UpiApplication
{
	void sendMoney();
	void recieveMoney();
	void checkBalance();
}

// object implementation layer
class GooglePay implements UpiApplication
{
	public void sendMoney()
	{
		System.out.println("send mony through google pY");
	}
	public void recieveMoney()
	{
		System.out.println("RECIEV MONY THROUGH GOOGLE PAY");
	}
	public void checkBalance()
	{
		System.out.println(" check balance through ggolepay");
	}
}

class Phonepe implements UpiApplication
{
	public void sendMoney()
	{
		System.out.println("send mony through phone pY");
	}
	public void recieveMoney()
	{
		System.out.println("RECIEV MONY THROUGH phone pe PAY");
	}
	public void checkBalance()
	{
		System.out.println(" check balance through phone pay");
	}
}

class Paytm implements UpiApplication
{
	public void sendMoney()
	{
		System.out.println("send mony through paytm pY");
	}
	public void recieveMoney()
	{
		System.out.println("RECIEV MONY THROUGH paytm PAY");
	}
	public void checkBalance()
	{
		System.out.println(" check balance through paytm");
	}
}

// object creation layer 
class BankAccount
{
	UpiApplication transaction(char app)
	{
		if(app == 'G')
		{
			return new GooglePay();
		}
		else if(app == 'P')
		{
			return new Phonepe();
		}
		
		else
		{
			return new Paytm();
		}
		
	}
}


// object implementation layer
public class Program2 {
	public static void main(String[] args) {
		BankAccount user1 = new BankAccount();
		UpiApplication ref = user1.transaction('G');
		ref.sendMoney();
		ref.recieveMoney();
		ref.checkBalance();
	}
}
