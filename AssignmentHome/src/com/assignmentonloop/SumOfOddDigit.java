//te a Java program to find sum of all odd numbers between 1 to n.
package com.assignmentonloop;

import java.util.Scanner;

public class SumOfOddDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int sum = 0;
		int number = sc.nextInt();
		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}

		}
		System.out.println("Sum Of even No. till " + number + " is = " + sum);

	}

}
