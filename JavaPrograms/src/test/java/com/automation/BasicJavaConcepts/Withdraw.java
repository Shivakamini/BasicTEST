package com.automation.BasicJavaConcepts;

public class Withdraw {

	public int empid;
	public String name;
	public double balance;
	public double deposit;
	public double withdraw;
	void set(int empid,String name,double balance)
	{
		this.empid=empid;
		this.name=name;
		this.balance=balance;
	}
	void print()
	{
		System.out.print(empid);
		System.out.print(name);
		System.out.print(balance);
	}
	void Deposit()
	{
		balance=balance+deposit;
		System.out.println(balance);
	}
	void withdraw()
	{
		if(withdraw>balance)
		{
			System.out.println("insufficient");
		}
		else
		{
			balance=balance-withdraw;
			System.out.println(balance);
		}
	}
	public static void main(String[] args) {

      Withdraw ww=new Withdraw();
      ww.set(5,"amma",10.00);
      ww.print();
      ww.deposit=200;
      ww.Deposit();
      ww.print();
      ww.withdraw=500;
      ww.withdraw();
      ww.print();
      ww.withdraw=50;
      ww.withdraw();
      ww.print();


	}

}
