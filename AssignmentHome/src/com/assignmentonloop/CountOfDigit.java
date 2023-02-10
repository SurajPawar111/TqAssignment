package com.assignmentonloop;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int degit=sc.nextInt();
		int count=0;
		while(degit!=0)
		{
		degit/=10;
		count++;
		
		}
		System.out.println("Total digit are "+count);

	}

}
