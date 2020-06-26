package com.marlabs.bala.Sort;

import java.util.*;


public class Buble {
	
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while (!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
		Buble.bubbleSort(array);
		System.out.println("Array after bubble sort : " + Arrays.toString(array));
		
	}
	

}
