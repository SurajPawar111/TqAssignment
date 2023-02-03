package com.conditionalAssi;

import java.util.Scanner;

public class SalaryEmploye {

	public static void main(String[] args) {
		Scanner se = new Scanner(System.in);
		System.out.println("Enter salary of Employee in Thousand");
		int sal = se.nextInt();
		if (sal <= 10000) {
			float hra1 = (float) (sal * 0.2);
			System.out.println("HRA is = " + hra1);
			float da1 = (float) (sal * 0.8);
			System.out.println("DA is = " + da1);
		} else if (sal <= 200000) {
			float hra2 = (float) (sal * 0.25);
			System.out.println("HRA is = " + hra2);
			float da2 = (float) (sal * 0.9);
			System.out.println("DA is = " + da2);
		} else {
			float hra3 = (float) (sal * 0.3);
			System.out.println("HRA is = " + hra3);
			float da3 = (float) (sal * 0.95);
			System.out.println("DA is = " + da3);
		}
		se.close();

	}

}
