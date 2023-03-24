package com.patternhomework;

import java.util.Scanner;

public class AngleFromRight {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of rows");
		int n=scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println("-----------------------");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
		System.out.println("-----------------------");

		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				count = count + 1;
				System.out.print(count);
			}

			System.out.println();
		}

	}

}
