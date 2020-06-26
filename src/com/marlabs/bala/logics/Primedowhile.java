package com.marlabs.bala.logics;

import java.util.*;

public class Primedowhile {

	public static void main(String[] args) {
		int i = 2;
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		do {
			if (num % i == 0) {
				System.out.println(num + " is not a Prime Number");
				break;
			}
			++i;

		} while (num >i);
		if (i== num) {
			System.out.println(num + " is Prime Number");
		} 

	}

}
