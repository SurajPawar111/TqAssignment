//1.	 WAP to print even numbers from 121 to 229 using for loop. 
package com.assignmentonloop;

public class EvenNumQ1 {

	public static void main(String[] args) {
		int a = 121;
		int b = 229;
		for (int i = 121; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(a + " is even no");

			}
			a++;
		}

	}
}