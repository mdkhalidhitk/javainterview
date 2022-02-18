package com.desgined.pattern.abstarct.factory;

public class FactoryProvider {

	public static AbastractFactory<?> getFactory(String factorType) {

		if ("Car".equalsIgnoreCase(factorType)) {
			return new CarFactory();
		}
		else if ("truck".equalsIgnoreCase(factorType)) {
			return new TruckFacory();
		}

		return null;

	}
}
