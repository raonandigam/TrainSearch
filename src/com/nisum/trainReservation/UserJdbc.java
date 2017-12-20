package com.nisum.trainReservation;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserJdbc {
	Connection con=null;
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:MysQL://localhost:3306/Train","root","root");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  


}
