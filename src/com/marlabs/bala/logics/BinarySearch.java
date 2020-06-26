package com.marlabs.bala.logics;

import java.util.Scanner;

public class BinarySearch {
	
	
	public static void main(String[] args)
	{
		int counter, elements, num, array[], first, last, middle;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of array elements .. ");
		elements = sc.nextInt();
		array = new int[elements];

	      System.out.println("Enter " + elements + " integer elements in to the array..");
	      for (counter = 0; counter < elements; counter++)
	      {
	          array[counter] = sc.nextInt();
	      }
	      System.out.println("Enter the search Element:");
	      num = sc.nextInt();
	      first = 0;
	      last = elements - 1;
	      middle = (first + last)/2;
	      while( first <= last )
	      {
	         if ( array[middle] < num )
	         {
	           first = middle + 1;
	         }
	         else if ( array[middle] == num )
	         {
	           System.out.println("Entered search " + num + " found at index " + (middle) + " and " +"Element location is : " + (middle+1));
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println("Entered search element : " + num + " is not found.\n");
	   }
}
