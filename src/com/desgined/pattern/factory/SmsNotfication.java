package com.desgined.pattern.factory;

public class SmsNotfication implements Notification {

	@Override
	public String notifyUser(String mobileNumber) {

		return "Sms send to this user : " + mobileNumber;
	}

}
