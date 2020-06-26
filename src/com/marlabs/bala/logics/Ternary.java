package com.marlabs.bala.logics;

public class Ternary {
	
	public static void main(String[] args)
	{
		int a = 20;
		int b = 10;
		int c = 30,result;
		result =((a>b) ? (a>c) ? a:c:(b>c)? b:c);
		System.out.println("max of three no: " + result);
	}

}
