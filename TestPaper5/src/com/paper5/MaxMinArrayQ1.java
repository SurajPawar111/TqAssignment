//Q1. Write a java program to find maximum and minimum from an array.


package com.paper5;



public class MaxMinArrayQ1 {
	public static void main(String[] args) {
		
		int ar[]= {10,20,30,80,56,77,14,58,98};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
				max=ar[i];
			if(ar[i]<min)
				min=ar[i];
		}
		System.out.println("Max value is "+ max);
		System.out.println("Min value is "+ min);
	}

}