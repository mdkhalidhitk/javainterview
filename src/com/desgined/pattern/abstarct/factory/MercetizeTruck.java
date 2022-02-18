package com.desgined.pattern.abstarct.factory;

public class MercetizeTruck implements Truck {

	@Override
	public String returnTruchModle(String model) {
		
		return "Truck model" + model;
	}

	@Override
	public Float truckPriceBasedOnModel(String model) {
		
		return 989f;
	}

}
