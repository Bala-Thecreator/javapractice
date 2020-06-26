package com.marlabs.bala.Sort;

public class SelectionSort {
	
	
	public static void main(String[] args)
	{
		SelectionSort ssort = new SelectionSort();
		int array[] = {23,29,12,32,45,76,98,75};
		ssort.sort(array);
		System.out.println("Sorted Array");
		ssort.printArray(array);
	}
	void printArray(int array[])
	{
		int length = array.length;
		System.out.print("[");
		for(int i =0 ;i<length;++i)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.print("]");
	}
	
	void sort(int array[])
	{
		int size = array.length;
		
		for(int i = 0 ;i<size-1;i++)
		{
			int minindex = i;
			for(int j = i+1 ; j<size;j++)
			{
				if(array[j] < array[minindex])
				{
					minindex = j;
				}
			}
			int temp = array[minindex];
			array[minindex] = array[i];
			array[i] = temp;
		}
	}

}
