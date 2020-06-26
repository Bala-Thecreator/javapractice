package com.marlabs.bala.designpatterns.Factory;

import java.io.*;

abstract class Plan
{

	protected double rate;
	abstract void getRate();

	public void calculateBill(int units)
	{
		System.out.println("Calculated bill value : " + (units*rate));
	}
}

class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate = 3.50;
	}
}

class CommertialPlan extends Plan
{
	public void getRate()
	{
		rate = 7.50;
	}
}
class InstitutionalPlan extends Plan
{
	public void getRate()
	{
		rate = 5.50;
	}
}

class GetPlanFactory
{
	public Plan getPlan(String planType)
	{
		if(planType == null)
		{
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlan"))
		{
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("CommertialPlan"))
		{
			return new CommertialPlan();
		}
		else if(planType.equalsIgnoreCase("InstitutionalPlan"))
		{
			return new InstitutionalPlan();
		}
		return null;
	}
}

public class GenerateBill {

	public static void main(String[] args)throws Exception
	{
		GetPlanFactory planFact = new GetPlanFactory();

		System.out.println("Enter name of the plan...");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();

		System.out.println("Enter the number of units..");

		int units = Integer.parseInt(br.readLine());

		Plan p = planFact.getPlan(planName);

		System.out.print("Bill Amount for " + planName + " of " + units + " units is : ");
		p.getRate();
		p.calculateBill(units);
	}
}
