package com.nisum.trainReservation;

public class Train {
	String  name;
	int number;
	public Train(String name,int number) {
		this.name=name;
		this.number=number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}

}
