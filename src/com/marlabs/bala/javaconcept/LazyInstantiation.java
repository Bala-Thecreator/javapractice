package com.marlabs.bala.javaconcept;

public class LazyInstantiation {
	
	private static LazyInstantiation li;
	
	private LazyInstantiation()
	{
		
	}
	public static LazyInstantiation getLazyInstantiation()
	{
		if(li == null)
		{
			synchronized (LazyInstantiation.class) {
				if(li == null)
				{
					li = new LazyInstantiation();
				}
			}
		}
		return null;
	}
	
	public void dosomething()
	{
		System.out.println("Hi.. I am Lazy instantiation from singleton design pattern..");
	}
	
	public static void main(String[] args)
	{
		LazyInstantiation li = new LazyInstantiation();
		li.dosomething();
	}

}
