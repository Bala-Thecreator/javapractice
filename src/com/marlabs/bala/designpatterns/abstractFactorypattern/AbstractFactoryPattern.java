package com.marlabs.bala.designpatterns.abstractFactorypattern;

import java.io.*;

interface Bank
{
	String getBankname();
}

class HDFC implements Bank
{
	private final String bname;
	
	public HDFC()
	{
		bname = "HDFCBank";
	}
	public String getBankname()
	{
		return bname;
	}
}
class SBI implements Bank
{
	private final String bname;
	
	public SBI()
	{
		bname = "SBIBank";
	}
	public String getBankname()
	{
		return bname;
	}
}
class ICICI implements Bank
{
	private final String bname;
	
	public ICICI()
	{
		bname = "ICICIBank";
	}
	public String getBankname()
	{
		return bname;
	}
}

abstract class Loan
{
	protected double rate;
	abstract void getInterestRate(double rate);
	public void calLoanPayment(double loanamount, int years)
	{
		double EMI;
		int n;
		n = years * 12;
		rate = rate/1200;
		EMI = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
		
		System.out.println("Monthly EMI is " + EMI + " for the amount " + loanamount + "you have borrowed ");
	}
}

class HomeLoan extends Loan
{
	public void getInterestRate(double r)
	{
		rate = r;
	}
	
}
class BusinessLoan extends Loan
{
	public void getInterestRate(double r)
	{
		rate = r;
	}
}
class EducationLoan extends Loan
{
	public void getInterestRate(double r)
	{
		rate =r;
	}
}
abstract class AbstractFactory
{
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}

class BankFactory extends AbstractFactory
{
	public Bank getBank(String bank)
	{
		if(bank == null)
		{
			return null;
		}
		if(bank.equalsIgnoreCase("HDFC"))
		{
			return new HDFC();
		}
		else if(bank.equalsIgnoreCase("ICICI"))
		{
			return new ICICI();
		}
		else if(bank.equalsIgnoreCase("SBI"))
		{
			return new SBI();
		}
		return null;
	}
	public Loan getLoan(String loan)
	{
		return null;
	}
}

class Loanfactory extends AbstractFactory
{
	public Bank getBank(String bank)
	{
		return null;
	}
	
	public Loan getLoan(String loan)
	{
		if(loan == null)
		{
			return null;
		}
		if(loan.equalsIgnoreCase("BusineessLoan"))
		{
			return new BusinessLoan();
		}
		else if(loan.equalsIgnoreCase("EducationLoan"))
		{
			return new EducationLoan();
		}
		else if(loan.equalsIgnoreCase("HomeLoan"))
		{
			return new HomeLoan();
		}
		return null;
	}
	
}
class FactoryCreator
{
	public static AbstractFactory getFactory(String choice)
	{
		if(choice.equalsIgnoreCase("Bank"))
		{
			return new BankFactory();
		}
		else if (choice.equalsIgnoreCase("Loan"))
		{
			return new Loanfactory();
		}
		return null;
	}
}


public class AbstractFactoryPattern {
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Bank name to get the Loan");
		String bankname = br.readLine();
		System.out.println("Enter the type of Loan u required ");
		String loanname = br.readLine();
		
		AbstractFactory bankfactory = FactoryCreator.getFactory("Bank");
		Bank b = bankfactory.getBank(bankname);
		
		System.out.println("Enter the Interest rate " + b.getBankname() + ": ");
		
		double rate = Double.parseDouble(br.readLine());
		
		System.out.println("Enter the Loan amount..");
		
		double loanamount = Double.parseDouble(br.readLine());
		
		System.out.println("Enter the no.of years to pay..");
		int years = Integer.parseInt(br.readLine());
		System.out.println("Taking Loan from " + b.getBankname());
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
		Loan l = loanFactory.getLoan(loanname);
		l.getInterestRate(rate);
		l.calLoanPayment(loanamount, years);
	}
	

}
