package com.desgined.pattern.abstarct.factory;

public class TruckFacory implements AbastractFactory<Truck> {

	@Override
	public Truck create(String CarModel) {
		if ("MS".equals(CarModel)) {
			return new MahindraTruck();
		} else if ("MB".equalsIgnoreCase(CarModel)) {
			return new MercetizeTruck();
		}
		return null;
	}

}
