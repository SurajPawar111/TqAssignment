package com.assignmentonstring;

import java.util.Scanner;

public class ReverseString {
	static Scanner sc = new Scanner(System.in);

	public static void reverseString(String st) {
		String reverseStr = "";

		for (int j = st.length() - 1; j >= 0; j--) {
			reverseStr = reverseStr + st.charAt(j);
		}
		System.out.println(reverseStr);
	}

	public static void revWord(String st) {

		String splitst[] = st.split("\\s");
		String revSt = "";
		for (int i = 0; i < splitst.length; i++) {
			for (int j = splitst[i].length() - 1; j >= 0; j--) {
				revSt = revSt + splitst[i].charAt(j);

			}
			revSt=revSt+" ";

		}
		System.out.println(revSt);
	}

	public static void main(String[] args) {
		String str="I like java";
		System.out.println(str);

		reverseString(str);
		revWord(str);
	}

}
