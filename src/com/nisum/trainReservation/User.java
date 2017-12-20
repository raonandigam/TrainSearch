package com.nisum.trainReservation;

public class User {
	 String firstName;
     String lastName;
     String mobileNumber;
     String email;
     String password;
     public User(String firstName,String lastName,String mobileNumber,String email,String password) {
    	 this.firstName=firstName;
    	 this.lastName=lastName;
    	 this.mobileNumber=mobileNumber;
    	 this.email=email;
    	 this.password=password;
    	 
     }
     
     public String getFirstName() {
		return firstName;
    	 
     }
     
     public String getLastName() {
    	 return lastName;
    	 
     }
     public String getMobileNumber() {
    	 return mobileNumber;
     }
     
     public String getEmail() {
    	 return email;
     }
     public String getPassWord() {
    	 return password;
     }
}
