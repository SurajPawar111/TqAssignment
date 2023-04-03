package com.classwwork15mar;

public class DuplicateWords {
	public static void duplicateWords(String str) {

		
		str = str.toLowerCase();
		String words[] = str.split(" ");
		int count;
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}

			if (count > 1 )
				System.out.println(count+" : " + words[i]);
		}
	}

	
	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog";

		duplicateWords(str);

	}

}
