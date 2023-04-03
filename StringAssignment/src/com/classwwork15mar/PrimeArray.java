package com.classwwork15mar;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < 5; i++) {
			array[i] = sc.nextInt();
		}

		System.out.println("Prime no in Array");
		for (int i = 1; i < array.length; i++) {
			boolean status = true;

			for (int j = 2; j <= 2; j++) {
				if (array[j] % i == 0) {
					// System.out.println(num + " is not a prime number ");
					status = false;
					break;
				}
			}
			if (status) {
				System.out.println(array[i]);
			}
			if ((array[i] == 0 || (array[i] == 1))) {
				System.out.println(array[i] + " is not a prime number");
			} 

		}
	}
}
