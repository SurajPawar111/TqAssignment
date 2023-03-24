package com.contanmenthomeassist;

public class DrivarDet {
	private int id;
	private String driName;
	private int age;

	DrivarDet() {
	}

	public DrivarDet(int id, String driName, int age) {
		this.id = id;
		this.driName = driName;
		this.age = age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setDriName(String driName) {
		this.driName = driName;
	}

	public String getDriName() {
		return driName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "ID is: " + id + " Driver Name: " + driName + " Age: " + age;
	}

}
