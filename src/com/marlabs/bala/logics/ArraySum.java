package com.marlabs.bala.logics;

import java.util.*;

public class ArraySum {

	static void sumElements(int arr[], int array_size, int sum) 
	{ 
		for (int i = 0; i < array_size - 1; i++) 
		{
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = i + 1; j < array_size; j++) 
			{
				System.out.println("a[i] : " + arr[i]);
				System.out.println("a[j] : " + arr[j]);
				int x = sum - (arr[i] + arr[j]);
				System.out.println("x : " + x);
				System.out.println("--------");
				if (set.contains(x))
				{
					System.out.println(set.contains(x));
					System.out.println( "possible Combinations are : (" + x +"," + arr[i] + ","+ arr[j] + ")"); 
					System.out.println(".........");
				}
				else
				{
					set.add(arr[j]);
					System.out.println("add..." + set);
				}
			}
		} 
	} 
	public static void main(String[] args) 
	{ 
		int arr[] = {1,6,3,0,8,4,1,7}; 
		int array_size = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the requied sum..");
		int sum = sc.nextInt();
		sumElements(arr, array_size, sum); 
	} 


}
