package com.classwwork15mar;

import java.util.Arrays;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentMarks s1=new StudentMarks();
		
		s1.setId(101);
		s1.setName("Suraj");
		float ar[]= {88,99,89,77,84};
		s1.setMarks(ar);
		System.out.println(Arrays.toString(ar));
  		
		
		
	}
}
