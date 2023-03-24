package com.contanmenthomeassist;

import java.util.Scanner;

public class CarDriDetails {

	public static void main(String[] args) 
	{
		Scanner sa=new Scanner(System.in);
		
		DrivarDet d1 = new DrivarDet(01, "Ram",60);
		Car c1 = new Car(01, "Thar", 900000f, "red", d1);
		DrivarDet d2 = new DrivarDet(02, "Shyam",50);
		Car c2 = new Car(02, "Skoda", 800000f, "Black", d2);
		System.out.println(c1);
		System.out.println(c2);
		d1.setId(122);
		d1.setAge(90);
		d1.setDriName("Suraj");
		System.out.println(d1);
		Car c9 = new Car(01, "Thar", 900000f, "red", d1);
		System.out.println(c9);
		System.out.println("Enter name");
		d1.setDriName(sa.next());
		System.out.println("Enter name");
		d1.setDriName(sa.next());
		System.out.println(d1);
		
	}
  
}
