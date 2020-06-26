package com.marlabs.bala.javaconcept;

public class EarlyInstantiation {
	private static EarlyInstantiation ei = new EarlyInstantiation();
	
	private EarlyInstantiation()
	{
		
	}
	
	public static EarlyInstantiation getEarlyInstantiation()
	{
		return ei;
	}
	
	public void doSomething()
	{
		System.out.println("Hi..I am Early Instantiation from singleton design pattern");
	}
	
	public static void main(String[] args)
	{
		EarlyInstantiation obj = new EarlyInstantiation();
		obj.doSomething();

	}
	


}
