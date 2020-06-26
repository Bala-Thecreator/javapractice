package com.marlabs.bala.Sort;

import java.util.*;

public class BubbleSort {
	
	public static void main(String[] args)
	{
		int[] array = new int[] {3,2,6,8,9,11,45,67,34};
		BubbleSort sort = new BubbleSort();
		sort.bubble(array);
		System.out.println("sorted array after bubble sort..");
		sort.printArray(array);
		System.out.println();
		System.out.println("Array After bubble sort " + Arrays.toString(array));
	}
	
	public void bubble(int[] a)
	{
		int length = a.length;
		int temp;
		for(int i = 0; i<length;i++)
		{
			for(int j = 0; j<length-i-1;j++)
			{
				if(a[j] >a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}	
			}
		}
	}
	void printArray(int[] arr)
	{
		int size = arr.length;
		System.out.print("[");
		for(int i =0; i<size;i++)
		{
			System.out.print(arr[i] + ", ");

		}
		System.out.print("]");
	}

}
