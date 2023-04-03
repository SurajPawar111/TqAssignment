package com.classwwork15mar;

public class ShiftZero {
	
	public static void zeroEnd(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count++;
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {5,6,0,-7,5,0,4,0,5,6,-2};
		
		
	}

}
