package com.nisum.trainReservation;

public class Train {
	String  name;
	int number;
	String source;
	String destination;
	public Train(String name,int number,String source,String destination) {
		this.name=name;
		this.number=number;
		this.source=source;
		this.destination=destination;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getSource() {
		return this.source;
		
	}
	public String getDestination() {
		return this.destination;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", number=" + number + ", source=" + source + ", destination=" + destination
				+ "]";
	}
	
	


}
