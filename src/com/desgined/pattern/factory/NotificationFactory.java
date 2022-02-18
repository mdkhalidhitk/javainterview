package com.desgined.pattern.factory;

public class NotificationFactory {

	public Notification getNotficationByType(String notficatioType) {

		if (null == notficatioType) {
			return null;
		}
		if ("SMS".equals(notficatioType)) {
			return new SmsNotfication();
		} else if ("EMAIL".equals(notficatioType)) {
			return new EmailNotfication();
		} else if ("PUSH".equals(notficatioType)) {
			return new DashBoard();
		}
		return null;

	}

}
