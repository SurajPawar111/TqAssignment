package com.conditionalAssi;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Unit:");
		float unit= sc.nextInt();
		if(unit<=50) {
			System.out.println("Totl bill is RS "+(unit *= 0.50));
		}
		else if((unit>50)&&(unit<=150)){
			System.out.println("Totl bill is RS "+(unit *=0.75));
		}
		else if((unit>150)&&(unit<=250)) {
			System.out.println("Totl bill is RS "+(unit *=1.20));
				}
		else 
			System.out.println("Total Bill is RS "+(unit*=1.50));
		sc.close();
		}
	}


