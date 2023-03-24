package com.contanmenthomeassist;

public class Car {
	private int carid;
	private String carname;
	private float price;
	private String color;
	private DrivarDet driverDet;

	Car() {
	}

	Car(int carid, String carname, float price, String color,DrivarDet driverDet) {
		this.carid = carid;
		this.carname = carname;
		this.price = price;
		this.color = color;
		this.driverDet=driverDet;
	}
	public void setDriverDet(DrivarDet driverDet) {
		this.driverDet=driverDet;
	}
	public DrivarDet grtDriverDet() {
		return driverDet;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public int getCarid() {
		return carid;
	}
	public void setCarname(String carname) {
		this.carname=carname;
	}
	public String getCarname() {
		return carname;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public float getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public String toString() {
		return "Car Detais id: "+carid+" "+carname+" "+price+" "+color+"  "+driverDet; 
	}

}
