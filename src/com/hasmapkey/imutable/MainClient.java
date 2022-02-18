package com.hasmapkey.imutable;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainClient {

	public static void main(String[] args) {
		Car car= new Car(10l,"name");
		Map<Car, String> carHasmap= new LinkedHashMap<Car, String>();
		
		carHasmap.put(car, "key");
		
		
		System.out.println(carHasmap.get(car));
	}

}
