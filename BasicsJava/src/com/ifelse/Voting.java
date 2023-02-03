package com.ifelse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age of person:");
		no = sc.nextInt();
		if (no >= 18) {
			System.out.println("you can vote");
		} else {
			System.out.println("You can not vote");
		}
		sc.close();
	}

}
