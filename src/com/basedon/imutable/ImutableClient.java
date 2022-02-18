package com.basedon.imutable;

public class ImutableClient {

	public static void main(String[] args) {
		Address address = new Address("Kolkata", "W.B");
		System.out.println("addressCode" + address.hashCode());
		Student stu = new Student(1l, "khalid", address);
		System.out.println("Student " + stu);

		Address add = stu.getAddress();
		add.setCity("Blr");
		add.setState("Karnataka");

		System.out.println("Hascode after add" + add.hashCode());

	}

}
