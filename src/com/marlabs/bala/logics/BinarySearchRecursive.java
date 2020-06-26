package com.marlabs.bala.logics;

import java.util.Scanner;

public class BinarySearchRecursive {
	
	int binarySearch(int arr[], int left, int right, int x) 
    { 
        if (right >= left) 
        { 
            int middle = left+ (right - left) / 2; 

            if (arr[middle] == x)
            {
                return middle; 
            }
            if (arr[middle] > x)
            {
                return binarySearch(arr, left, middle - 1, x); 
            }
            return binarySearch(arr, middle + 1, right, x); 
        } 

        return -1; 
    } 

    public static void main(String args[]) 
    { 
    	BinarySearchRecursive ob = new BinarySearchRecursive(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for..");
        int num = sc.nextInt();
        int search = ob.binarySearch(arr, 0, size - 1, num); 
        if (search == -1)
        {
            System.out.println("Entered Element '" + num + "' not present in the array");
        }
        else
        {
            System.out.println("Entered Element '" + num + "' found at index " + search); 
        }
    } 

}
