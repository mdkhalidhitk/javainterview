package com.basedon.imutable;

import lombok.ToString;

@ToString
public final class Student {

	final private Long id;
	final private String name;
	final Address address;

	public Student(Long id, String name, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return Address.getInstance(address);
	}
	

}
