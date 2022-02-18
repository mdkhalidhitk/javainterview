package com.desgined.pattern.factory;

public class ClientMainClass {
	public static void main(String[] args) {
		
		NotificationFactory notfNotificationFactory= new  NotificationFactory();
		Notification notfication=notfNotificationFactory.getNotficationByType("SMS");
		System.out.println(notfication.notifyUser("9886279248"));
	}

}
