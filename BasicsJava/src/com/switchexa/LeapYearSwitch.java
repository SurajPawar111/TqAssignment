package com.switchexa;

import java.util.Scanner;

public class LeapYearSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month : ");
		int month=sc.nextInt();
		System.out.println("Enter a Year");
		int year=sc.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(" 31 Days");
		        break;
		case 2:
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(" 30 Days");
		break; 
		}
		if((year%400==0)||((year%4==0)&&(year%100!=0))) {
			System.out.println(year+" is Leap year");
			
		}
		else 
			System.out.println(year +" is not leap year");
		
		}
	}


