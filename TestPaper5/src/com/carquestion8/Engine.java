package com.carquestion8;

public class Engine {
	private String enginetype;
	private int price;
	
	Engine(){
		
	}
	Engine(String enginetypr,int price){
		this.enginetype=enginetypr;
		this.price=price;
		
	}
	
	public void setEnginetype(String Enginetype) {
		this.enginetype=Enginetype;
	}
	

}
