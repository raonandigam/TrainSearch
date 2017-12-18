package com.nisum.trainReservation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainService {
	public List<Train> getTrains() throws SQLException{
		TrainsJdbc trainsJdbc = new TrainsJdbc();
		
		List<Train> trains=new ArrayList();
		Train train1=new Train("Godavari",10101);
		Train train2=new Train("Hyderbad",10102);
		Train train3=new Train("Padmavathi",10103);
	     
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains=trainsJdbc.getTrains();
		return trains;
		
		
		
		
		
	}

}
