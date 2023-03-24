package com.mobilestorecrud;


public class Mobile {
	int mid;
	String name;
	float price;
	String brand;
	
	public Mobile() {
		super();
	}

	public Mobile(int mid, float price,String name, String brand) {
		super();
		this.mid = mid;
		this.name=name;
		this.price = price;
		this.brand = brand;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", name=" + name + ", price=" + price + ", brand=" + brand + "]";
	}

	

}
