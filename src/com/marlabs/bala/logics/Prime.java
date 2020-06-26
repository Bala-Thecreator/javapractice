package com.marlabs.bala.logics;

import java.util.*;


public class Prime {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  num = sc.nextInt();
		int i = 2;
		boolean flag = false;
		 for(i = 2; i <= num/2; ++i)
	        {

	            if(num % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }
//		while(i <= num/2)
//		{
//			if(num % i == 0)
//			{
//				flag= true;
//				break;
//			}
//			++i;
//		}
		if(!flag)
		{
			System.out.println(num + " is Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}
		
	}

}
