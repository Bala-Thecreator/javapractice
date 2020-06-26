package com.marlabs.bala.logics;

import java.util.Scanner;

public class Array {

	static void sumElements(int arr[], int array_size, int sum) 
	{ 
		for (int i = 0; i < array_size - 2; i++) 
		{ 
			for (int j = i + 1; j < array_size - 1; j++) 
			{ 
				for (int k = j + 1; k < array_size; k++) 
				{ 
					if (arr[i] + arr[j] + arr[k] == sum) { 
						System.out.println( "possible Combinations are : (" + arr[i] + "," + arr[j] + "," + arr[k] +")"); 
					} 
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
