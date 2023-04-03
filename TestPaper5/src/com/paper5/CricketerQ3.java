
//Q3. Create a java class Cricketer. Class has int playerid, String name , Boolean isBaller , float strikerate ,
//int runs. All fields are private.
//Write getter setter for all fields of this class.

package com.paper5;

public class CricketerQ3 {
	private int id;
	private String name;
	private boolean isBaller;
	private float strikerate;
	private int runs;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBaller() {
		return isBaller;
	}

	public void setBaller(boolean isBaller) {
		this.isBaller = isBaller;
	}

	public float getStrikerate() {
		return strikerate;
	}

	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	

}
