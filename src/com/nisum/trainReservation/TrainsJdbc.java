package com.nisum.trainReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TrainsJdbc {
	  public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("com.mysql.jdbc.Driver");  
	            con=DriverManager.getConnection("jdbc:MysQL://localhost:3306/Train","root","root");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	  
	  
	  public List<Train> getTrains() throws SQLException {
		  Connection con = getConnection();
		  Statement stmt = con.createStatement();
		  ResultSet rs = stmt.executeQuery("select * from Trains");
		  List<Train> trains = new ArrayList<Train>();
		  while(rs.next()) {
			  Train train = new Train(rs.getString("TrainName"),rs.getInt("TrainNumber"),rs.getString("source"),rs.getString("destination"));
			  trains.add(train);
		  }
		  return trains;
	  }
	  
	  
	  public List<Train> getTrains(String source,String destination) throws SQLException {
		  Connection con = getConnection();
		  Statement stmt = con.createStatement();
		  ResultSet rs = stmt.executeQuery("select * from Trains where Source='"+source+"' and Destination='"+destination+"'" );
		  List<Train> trains = new ArrayList();
		  while(rs.next()) {
			  Train train = new Train(rs.getString("TrainName"),rs.getInt("TrainNumber"),rs.getString("source"),rs.getString("destination"));
			  trains.add(train);		  
		  }	  
		  return trains;	  
	  }
	  
}
