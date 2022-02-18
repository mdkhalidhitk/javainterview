package com.desgined.pattern.abstarct.factory;

public class MarutiSuzuki implements Car {

	@Override
	public String returnCarModle(String model) {
		
		return model;
	}

	@Override
	public Float carPriceBasedOnModel(String model) {
		// TODO Auto-generated method stub
		return 98f;
	}

}
