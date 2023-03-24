package com.contanmenthomeassist;

public class Employe {
	private int id;
	private String name;
	private int exp;
	
	public Employe() {
		
	}

	public Employe(int id, String name, int exp) 
	{
		this.id = id;
		this.name = name;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String toString() {
		return "Employe id=" + id + "," + name + "," + exp ;
	}
	
	

}
