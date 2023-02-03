package com.nastedifelse;

import java.util.Scanner;

public class NastedIfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks:");

		float marks = sc.nextFloat();

		if (marks >= 65) {
			if (marks > 80) {
				System.out.println("You can opt both science and commerce.");
			} else {
				System.out.println("You can opt only commerce");
			}
		} else {
			System.out.println("You are not eligible to take admission");
		}

		sc.close();
	}

}
