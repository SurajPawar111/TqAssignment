//WAP to print even numbers from 121 to 229 using do-while loop. 
package com.assignmentonloop;

public class EvenByDoWhile {

	public static void main(String[] args) {
		int a = 121;
		int b = 229;
		do {
			a++;
			if(a%2==0)
				System.out.println(a+" even");
		}

		while (a <= b);
	}
}
