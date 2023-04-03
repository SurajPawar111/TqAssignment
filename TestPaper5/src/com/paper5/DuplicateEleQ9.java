//Q9. Write a program which deletes the duplicate elementts from Array
//input :[a,b,b,n,u,y,x,s,y]
//output: [a,n,u,x,s]

package com.paper5;

public class DuplicateEleQ9 {
	public static void main(String[] args) {

		char arr[] = { 'a', 'b', 'b', 'n', 'u', 'y', 'x', 's', 'y' };

		System.out.println("Duplicate Elements are ");
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					

				}
			}
		}

	}

}
