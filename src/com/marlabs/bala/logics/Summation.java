package com.marlabs.bala.logics;

import java.util.*;

public class Summation {
	
	public static void main(String[] args)
	{
		Double a, summation =0.0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number to perform additioin or '0 ' to exist");
			a = sc.nextDouble();
			summation += a;
		}
		while(a != 0.0);
		{
			System.out.println("summation " + summation);
		}
	}
	

}
