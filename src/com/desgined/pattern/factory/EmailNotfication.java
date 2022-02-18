package com.desgined.pattern.factory;

public class EmailNotfication implements Notification {

	@Override
	public String notifyUser(String email) {
		return "Email Notfied for this user email "+email;
		
		

	}

}
