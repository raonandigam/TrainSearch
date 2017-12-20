package com.nisum.trainReservation;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserJdbc {
	public static Connection getConnection(){  
		Connection con=null;
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:MysQL://localhost:3306/Train","root","root");  
	    }catch(Exception e){System.out.println(e);}
	    return con;  
	}  

	public void createUser(User user) {
		Connection con = getConnection();
		  
		String query = " insert into users (firstname, lastname, phone, email, password)"
		+ " values (?, ?, ?, ?, ?)";
		try {     
		    PreparedStatement preparedStmt = con.prepareStatement(query);
		    preparedStmt.setString (1, user.getFirstName());
		    preparedStmt.setString (2, user.getLastName());
		    preparedStmt.setDate   (3, user.getMobileNumber());
		    preparedStmt.setBoolean(4, user.getEmail());
		    preparedStmt.setInt    (5, user.getPassWord());
		    preparedStmt.execute();
		    con.close();
	    }
		catch (Exception e) {
			System.err.println("Got an exception!");
			System.err.println(e.getMessage());
		}
	}  


}
