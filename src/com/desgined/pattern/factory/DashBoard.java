package com.desgined.pattern.factory;

public class DashBoard implements Notification {

	@Override
	public String notifyUser(String user) {
		
		return " User can see notfication in Dash board itself"+user;
	}

}
