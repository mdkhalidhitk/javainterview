package com.desgined.pattern.abstarct.factory;

public class MahindraTruck implements Truck {

	@Override
	public String returnTruchModle(String model) {
		
		return model;
	}

	@Override
	public Float truckPriceBasedOnModel(String model) {
		
		return 100f;
	}

}
