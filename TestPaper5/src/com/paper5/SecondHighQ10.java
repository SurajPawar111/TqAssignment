//Q10. Write a program to print second highest number in array without sorting.


package com.paper5;

public class SecondHighQ10 {
	public static void main(String[] args) {
	
		
		int arr[]= {10,11,16,17,13,19,22,5,8,9};
	 
	                                
	     int highest = Integer.MIN_VALUE;
	     int secondHighest = Integer.MIN_VALUE;
	 
	     for (int i = 0; i < arr.length; i++) { 
	         if (arr[i] > highest) {
	            secondHighest = highest;
	 
	           highest = arr[i];
	        }
	 
	       if (arr[i] < highest && arr[i] > secondHighest) {
	          // Set second highest
	          secondHighest = arr[i];
	       }
	    }
	 
	    System.out.println("Second highest " + secondHighest);
	 
	  }
	 
		
	}


