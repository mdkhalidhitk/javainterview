package com.desgined.pattern.abstarct.factory;

public class CarFactory implements AbastractFactory<Car> {

	@Override
	public Car create(String CarModel) {

		if ("MS".equals(CarModel)) {
			return new MarutiSuzuki();
		} else if ("MB".equalsIgnoreCase(CarModel)) {
			return new MercedzBenz();
		}

		return null;
	}

}
