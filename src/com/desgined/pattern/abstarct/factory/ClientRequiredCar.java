package com.desgined.pattern.abstarct.factory;

public class ClientRequiredCar {

	public static void main(String[] args) {
		
		AbastractFactory<?> carAbastractFactory=FactoryProvider.getFactory("car");
		Car carType=(Car) carAbastractFactory.create("MS");
		System.out.println(carType.carPriceBasedOnModel("MZ"));
		
		
		AbastractFactory<?> truckAbastractFactory=FactoryProvider.getFactory("truck");
		 Truck truck=(Truck) truckAbastractFactory.create("MS");
		System.out.println(truck.truckPriceBasedOnModel("MZ"));
		
	}
}
