//Q7. Write a program to find average of digits in a given number. 
//If user enters 125 ,average of 1 , 2 and 5 is 2.6 . If user enters 6172 average is 4.


package com.paper5;

import java.util.Scanner;

public class AvarageOfNumQ7 {
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			int r = num%10;
			count++;
			num/=10;
			
		}
		System.out.println("Avarage is "+count);
		
	}

}
