package com.ternoryDemo;

import java.util.Scanner;

public class EvenOddTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		System.out.println(num+((num%2==0)?" Is Even":" is Odd"));
	}

}
