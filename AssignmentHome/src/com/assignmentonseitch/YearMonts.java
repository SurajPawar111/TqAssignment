//1. Write a Java program print total number of days in a month using switch case 

package com.assignmentonseitch;

import java.util.Scanner;

public class YearMonts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of month");
		int month = sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Days in maonth ts 31");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Days in maonth ts 30");
			break;
		case 2:
			System.out.println("Days in maonth ts 28");
			break;
		}

	}
}
