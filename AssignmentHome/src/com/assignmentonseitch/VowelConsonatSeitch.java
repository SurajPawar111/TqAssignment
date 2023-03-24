//3. Write a Java program to input any alphabet and check whether it is vowel or consonant 
package com.assignmentonseitch;

import java.util.Scanner;

public class VowelConsonatSeitch {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter Alphabet only");
		char ch=sa.next().charAt(0);
		
		switch(ch) {
		case 'A':
		case'E':
		case'I':
		case'O':
		case'U':System.out.println("Alphabet is vowel");
		break;
		case 'a':
		case'e':
		case'i':
		case'o':
		case'u':System.out.println("Alphabet is vowel");
		default:System.out.println("Alphabet is consonat");
			
	
		}
}
}
