package com.nisum.trainReservation;

import java.util.List;

public class UserService {
	public void createUser(User user) {
		UserJdbc userJdbc =new UserJdbc();
		userJdbc.createUser(user);
	}
}
 


