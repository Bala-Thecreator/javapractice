package com.marlabs.bala.logics;

import java.util.*;

public class ArraySequence {
	static void highestOrder(int arr[], int arr_size , int number) 
	{
		System.out.println("Initial array is : " +Arrays.toString(arr));
		System.out.println();
		int i,first,second,third,fourth,fifth,sixth;
		first = second = third = fourth = fifth = sixth =Integer.MIN_VALUE;
		for (i = 0; i < arr_size ; i++)
		{
			if (arr[i] > first)
			{
				first = arr[i];
			}
		}
		for (i = 0; i < arr_size ; i++)
		{
			if (arr[i] > second &&  arr[i] < first)
			{
				second = arr[i]; 
			}
		}
		for (i = 0;  i < arr_size ; i++)
		{
			if (arr[i] > third &&  arr[i] < second)
			{
				third = arr[i]; 
			}
		}
		for(i = 0;i< arr_size;i++)
		{
			if(arr[i] > fourth && arr[i] < third)
			{
				fourth = arr[i];
			}
		}
		for(i = 0;i< arr_size;i++)
		{
			if(arr[i] > fifth && arr[i] < fourth)
			{
				fifth = arr[i];
			}
		}
		for(i = 0;i< arr_size;i++)
		{
			if(arr[i] > sixth && arr[i] < fifth)
			{
				sixth = arr[i];
			}
		}

		if(number == sixth)
		{
			System.out.println("The sixth highest number in array is: " + sixth);
		}
		else if(number == fifth)
		{
			System.out.println("The fifth highest number in array is: " + fifth);
		}
		else if(number == fourth)
		{
			System.out.println("The fouth highest number in array is: " + fourth);
		}
		else if(number == third)
		{
			System.out.println("The third highest number in array is: " + third);
		}
		else if(number == second)
		{
			System.out.println("The second highest number in array is: " + second);
		}
		else if(number == first)
		{
			System.out.println("The first highest number in array is: " + first);
		}


	} 

	public static void main(String []args) 
	{ 
		int arr[] = {12, 13, 1, 10, 34, 16};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the highest order from array..");
		int num = sc.nextInt();
		int size = arr.length; 
		highestOrder(arr, size,num); 
	} 

}
