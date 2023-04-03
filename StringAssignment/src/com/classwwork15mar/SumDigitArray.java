package com.classwwork15mar;

public class SumDigitArray {

	public static void SumExtract(int[] arr) {

		int sum = 0;
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
	

	}
	public static void main(String[] args) {

		int arr[] = { 33, 56, 78, 98, 24, 66 };

		SumExtract(arr);
	}

}
