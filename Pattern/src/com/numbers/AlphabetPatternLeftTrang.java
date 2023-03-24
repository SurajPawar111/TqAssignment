package com.numbers;

import java.util.Scanner;

public class AlphabetPatternLeftTrang {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(" ");

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}

	}
}