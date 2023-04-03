package com.classwwork15mar;


public class CaseChange {
 
	
	
	
	
	
	public static void main(String[] args) {

		String str = "ProGrAmE";
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				x = x + Character.toUpperCase(ch);

			} else {
				x = x + Character.toLowerCase(ch);
			}
		}
		System.out.println(x);
	}

}


