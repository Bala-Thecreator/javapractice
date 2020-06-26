package com.marlabs.bala.logics;

import java.util.*;

public class ArrayOrder {

	public static void main(String[] args)
	{
		Integer[] array = new Integer[] {12,5,10,15,13,16,19,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number  = sc.nextInt();
		int array_size = array.length;
		//ArrayOrder.reverseArray(array);
		LargestEle(array, number, array_size);
	}

	public static void LargestEle(Integer[] arr ,int number, int size )
	{
		System.out.println("Initial array is : " +Arrays.toString(arr));
		System.out.println();
		Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Reversed array is : " +Arrays.toString(arr));

		for(int i = 0;i<size;i++)
		{
			if(number == arr[i])
			{
				System.out.println();
				System.out.println("Given number " + number +" is --: " + ++i + " highest number ");
			}
		}

	}
//	public static void reverseArray(Integer inputArray[])
//    {
//        System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
//         
//        int temp;
//         
//        for (int i = 0; i < inputArray.length/2; i++) 
//        {
//            temp = inputArray[i];
//             
//            inputArray[i] = inputArray[inputArray.length-1-i];
//             
//            inputArray[inputArray.length-1-i] = temp;
//        }
//        System.out.println("Array After Reverse : "+Arrays.toString(inputArray)); 
//      
//    }
	

}
