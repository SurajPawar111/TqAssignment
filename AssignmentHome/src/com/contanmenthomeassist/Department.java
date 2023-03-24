package com.contanmenthomeassist;

public class Department {
	private String dapname;
	private int depid;
	private int code;
	private Employe emp;
	
	Department(){
		
	}
	
	public Department(String dapname, int depid, int code,Employe emp) {
		this.dapname = dapname;
		this.depid = depid;
		this.code = code;
		this.emp=emp;
	}
	public void setEmp(Employe emp) {
		this.emp=emp;
	}
	public Employe getEmp() {
		return emp;
	}

	public String getDapname() {
		return dapname;
	}

	public void setDapname(String dapname) {
		this.dapname = dapname;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}


	public String toString() {
		return "Department: " + dapname + " id: " + depid + " code: " + code+" Employee: "+emp;
	}
	
	
	

}
