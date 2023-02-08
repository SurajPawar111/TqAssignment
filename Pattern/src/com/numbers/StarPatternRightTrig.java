package com.numbers;

import java.util.Scanner;

public class StarPatternRightTrig {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter A Rows");
		int n=sa.nextInt();
		for(int i=1;i<=n;i++) {
			
		//	  for(int j=1;j>=1;j--) { System.out.print(" "); }
			 
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
