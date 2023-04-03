package com.employee;

public class Department {
	private int id;
	private String depname;
	
	 Department() {
	}
	
	
	 Department(int id, String depname) {
		this.id = id;
		this.depname = depname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDepname() {
		return depname;
	}


	public void setDepname(String depname) {
		this.depname = depname;
	}


	@Override
	public String toString() {
		return "Department id=" + id + " depname=" + depname ;
	}
	 
	
	

}


