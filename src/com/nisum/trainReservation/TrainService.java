package com.nisum.trainReservation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainService {
	public List<Train> getTrains() throws SQLException{
		TrainsJdbc trainsJdbc = new TrainsJdbc();
		List<Train> trains;	
		trains=trainsJdbc.getTrains();
		return trains;
	}

    public List<Train> getTrainsBySource(String source,String destination) throws SQLException{
    	TrainsJdbc trainsJdbc = new TrainsJdbc();
    	List<Train> trains;	
    	trains=trainsJdbc.getTrains(source,destination);
    	return trains;
    }
}