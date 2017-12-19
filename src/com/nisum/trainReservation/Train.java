package com.nisum.trainReservation;

public class Train {
	String  name;
	int number;
	String source;
	String destination;
	public Train(String name,int number) {
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
	
	public String getsource() {
		return this.source;
		
	}
	public String getdestination() {
		return this.destination;
	}


}
