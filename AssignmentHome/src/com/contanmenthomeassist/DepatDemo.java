package com.contanmenthomeassist;

import java.util.Scanner;

public class DepatDemo {

	public static void main(String[] args) {
		
		Employe e1=new Employe(01,"Navnaath",5);
		Department d1=new Department("Mechanical",1001,1122,e1);
		System.out.println(d1);
		


	}

}
