package com.evenodd;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		no = sc.nextInt();
		if (no % 2 == 0) {
			System.out.println("--------------");
			System.out.println(no + " Number is even");
		} else {
			System.out.println("--------------");
			System.out.println(no + " Number is odd");
		}
		sc.close();
	}

}
