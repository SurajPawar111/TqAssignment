package com.classwwork15mar;

public class StudentMarks {
	private int id;
	private String name;
	private float marks[];
	
	StudentMarks()
	{
		
	}
	StudentMarks(int id,String name,float marks[]){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	

	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setMarks(float marks[]) {
		this.marks=marks;
	}
	public float[] getMarks() {
		return marks;
	}


}
