package com.desgined.pattern.abstarct.factory;

public class MercedzBenz implements Car {

	@Override
	public String returnCarModle(String model) {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public Float carPriceBasedOnModel(String model) {
		
		return 100f;
	}

}
