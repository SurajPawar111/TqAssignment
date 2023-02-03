package com.evenodd;

import java.util.Scanner;

public class BmiCalculation {

	public static void main(String[] args) {
		double bmi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in kg");
		float weight = sc.nextFloat();
		System.out.println("Enter height feet");
		double height = sc.nextFloat();
		height = (height * 0.3048);
		bmi = weight / (height * height);
		System.out.println("Bmi is :" + bmi);
		System.out.println("------------");
		if (bmi <= 18)
			System.out.println("Person is Underweight");
		else if (bmi <= 25)
			System.out.println("Person is normal");
		else
			System.out.println("Person is Over weight");
		sc.close();

	}

}
