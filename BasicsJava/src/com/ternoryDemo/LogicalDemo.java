package com.ternoryDemo;

import java.util.Scanner;

public class LogicalDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks:");
		float marks = sc.nextInt();
		System.out.println("Enter marks of best three : ");
		float bestThree = sc.nextFloat();
		if ((marks > 85) || (bestThree > 90))
			System.out.println("Eligable in collage");
		else
			System.out.println("not Eligable in clooage");
	}
}
