package com.ternoryDemo;

import java.util.Scanner;

public class ChacterInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Charactor:");
		ch = sc.next().charAt(0);
		if ((ch >= 'A') && (ch <= 'Z')) {
			System.out.println("Capital Lattee");
			if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
				System.out.println("Vowel");
			} else
				System.out.println("Consonant");
		} else if ((ch >= 'a') && (ch <= 'z')) {
			System.out.println("Small Lattee");
			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				System.out.println("Vowel");
			} else
				System.out.println("Consonant");
		} else if ((ch >= '0') && (ch <= '9')) {
			System.out.println(ch + " is Digit");
		} else

			System.out.println("Special Charactor");
		sc.close();
	}

}
