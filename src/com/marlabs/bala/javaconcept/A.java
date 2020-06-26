package com.marlabs.bala.javaconcept;

public class A {

	//	public static void main(String[] args)
	//	{
	//		try {
	//			int a,b;
	//			b=0;
	//			a= 5/b;
	//			System.out.println("A");
	//			
	//		}
	//		catch(Exception e)
	//		{
	//			e.printStackTrace();
	//		}
	//	}

	//	output
	//	java.lang.ArithmeticException: / by zero
	//	at com.marlabs.bala.javaconcept.A.main(A.java:10)

	//	public static void main(String args[]) 
	//	{ 
	//		try 
	//		{   
	//			int a[] = {1, 2,3 , 4, 5}; 
	//			for (int i = 0; i < 7; i++) 
	//				System.out.print(a[i] );
	//			System.out.println();
	//		} catch(ArrayIndexOutOfBoundsException e) 
	//		{
	//			//e.printStackTrace();
	//			//System.out.println(e);
	//			System.out.println("0"); 
	//		} 
	//	}

	//	public static void main(String[] args)  
	//	{ 
	//		try {      
	//			System.out.println(1); 
	//			int i=10/0; 
	//			System.out.println(2); 
	//		} 
	//		catch(ArithmeticException ex) {    
	//			System.out.println(3); 
	//			System.out.println(ex.getMessage()); 
	//			System.out.println(4); 
	//		}
	//		System.out.println(5); 
	//	}
	//	
	//	output
	//	1
	//	3
	//	/ by zero
	//	4
	//	5

	//	public static void main(String[] args) 
	//	{ 
	//		try 
	//		{ 
	//			int i; 
	//			return ; 
	//		} catch (Exception e) 
	//		{ 
	//			System.out.println("inCatchBlock"); 
	//		} 
	//		finally { 
	//			System.out.println("inFinallyBlock"); 
	//		} 
	//	}
	//	
	//	output
	//	inFinallyBlock

	//	public static void main(String[] args) throws ClassNotFoundException     
	//	{ 
	//		System.out.println(1); 
	//		if (true) 
	//		{ 
	//			throw new ClassNotFoundException(); 
	//		} 
	//		System.out.println(2); 
	//	}
	//	
	//	output
	//	1
	//	Exception in thread "main" java.lang.ClassNotFoundException
	//		at com.marlabs.bala.javaconcept.A.main(A.java:85)

	//	public static void main(String[] args)    
	//	{ 
	//		try { 
	//			System.out.println(1); 
	//			int i=10/0; 
	//			System.out.println(2); 
	//		} catch(NumberFormatException ex) 
	//		{
	//			System.out.println(4); 
	//			System.out.println(ex.getMessage()); 
	//			System.out.println(5); 
	//		} 
	//		finally { 
	//			System.out.println(6); 
	//		} 
	//		System.out.println(5); 
	//	}
	//	
	//	output
	//	1
	//	Exception in thread "main" 6
	//	java.lang.ArithmeticException: / by zero
	//		at com.marlabs.bala.javaconcept.A.main(A.java:99)

	//	public static void main(String[] args) 
	//	{ 
	//		try 
	//		{ 
	//			System.out.println(1); 
	//			String s=null; 
	//			System.out.println(s);
	//			System.out.println(s.length());
	//			System.out.println(2); 	
	//		}
	//		catch(NullPointerException ex) 
	//		{
	//			System.out.println("Inside the catch block...");
	//			ex.printStackTrace();
	//			System.out.println(4); 
	//			System.out.println(5); 
	//		} 
	//		System.out.println(6); 
	//	}
	//	
	//	output
	//	1
	//	null
	//	Inside the catch block...
	//	java.lang.NullPointerException
	//		at com.marlabs.bala.javaconcept.A.main(A.java:126)
	//	4
	//	5
	//	6
	
//	public static void main(String[] args) 
//	{ 
//		try 
//		{ 
//			System.out.println(1); 
//			String s=null; 
//			System.out.println(s); 
//			System.out.println(s.length()); 
//			System.out.println(2); 
//		} catch(NullPointerException ex) 
//		{ 
//			System.out.println(4); 
//			System.out.println(s); //s cannot be resolved to a variable
//			System.out.println(5); 
//		} 
//		System.out.println(6); 
//	}
//	
//	output
//	Compilation Error
	
	
//	int test1()   
//	{ 
//		System.out.println("Inside test1() ...");
//		try 
//		{ 
//			//some stmts 
//			System.out.println("Inside test1() try block ...");
//		} 
//		catch (ArithmeticException ex) 
//		{
//			System.out.println("Inside test1() catch block...");
//
//		} 
//		finally {
//			System.out.println("Inside test1() finally block...");
//
//		} 
//		return 10; 
//	} 
//	int test2()   
//	{
//		System.out.println("Inside the test2()...");
//		try 
//		{ 
//			//some stmts 
//			System.out.println("Inside test2() try block ...");
//
//		} catch (ArithmeticException ex) { 
//			System.out.println("Inside test2() catch block...");
//
//		} 
//		finally 
//		{
//			System.out.println("Inside test2() finally block ...");
//			return 30; 
//		} 
//	}
//	public static void main(String[] args)
//	{
//		A a1 = new A();
//		a1.test1();
//		a1.test2();
//		System.out.println("Inside the main method..");
//	}
//	
//	output
//	Inside test1() ...
//	Inside test1() try block ...
//	Inside test1() finally block...
//	Inside the test2()...
//	Inside test2() try block ...
//	Inside test2() finally block ...
//	Inside the main method..

	 
	
}

