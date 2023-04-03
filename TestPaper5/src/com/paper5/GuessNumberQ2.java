//Q2. Write a program in which computer asks user to guess the fixed number. Continue till user guesses correct number. 
//If user guesses higher number ask user to guess lower number and vice versa.

package com.paper5;

import java.util.Scanner;

public class GuessNumberQ2 {
	static Scanner sc = new Scanner(System.in);

	public static void guessMethod() {
		 int fin = 14;
		System.out.println("Welcome Guess Number Game");
		for (int i = 1; i >0; i++) {
			System.out.println("Gurss A number between 1-20");
			int num = sc.nextInt();
			if (num == fin) {
				System.out.println("Its Correct one you win....!");
				break;
			}

		}
	}

	public static void main(String[] args) {
		guessMethod();

	}

}
