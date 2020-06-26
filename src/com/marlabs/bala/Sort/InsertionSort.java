package com.marlabs.bala.Sort;

import java.lang.reflect.Array;

public class InsertionSort {
	
	
	public static void main(String[] args)
	{
		int array[] = new int[] {12,11,13,5,6};
		InsertionSort is = new InsertionSort();
		is.sort(array);
		
		printArray(array);	
	}
	
	void sort(int[] array)
	{
		for(int i = 1 ; i< array.length;i++)
		{
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && array[j] > key)
			{
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
		
	}
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print("Array after insertion sort is : ");
			System.out.print( array[i] + " ");
			
		}
	}

}
