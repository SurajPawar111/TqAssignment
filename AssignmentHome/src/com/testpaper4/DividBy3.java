//Q1. Write a program to display the number divisible by 3 from 1 to n numbers.

package com.testpaper4;

import java.util.Scanner;


public class DividBy3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a nth number of series");
		int n=sc.nextInt();
		System.out.println("Numbers divided by 3 are");
		for (int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
