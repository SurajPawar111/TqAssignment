package com.assignmentonstring;

public class ChangeCaseOfVow {
	public static void replace(String st) {
		st = st.toLowerCase();
		char ch1[] = st.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			if ((ch1[i] == 'a') || (ch1[i] == 'e') || (ch1[i] == 'i') || (ch1[i] == 'o') || (ch1[i] == 'u')) {
				ch1[i] = (char) Character.toUpperCase(i);

			}
			System.out.print(ch1[i]);
		}
		// System.out.println(ch1);
	}

	public static void main(String[] args) {
		String str = "ActionReplay";
		System.out.println(str);
		replace(str);
	}

}
