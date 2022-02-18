package com.java.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pagination.skip.limit.Page;
import com.pagination.skip.limit.PageUtil;

public class TestClassMe implements TestInterFace, TestInterface2 {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public void show12() {
		// TODO Auto-generated method stub
		TestInterface2.super.show();
	}

	public static List<Book> getBookList() {
		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book(500, "Core Java", 210, "khalid Hassan", 1065.5));
		bookList.add(new Book(501, "JSP & Servlets", 45, "Sameeha khalid", 1749.0));
		bookList.add(new Book(502, "Spring in Action", 480, "Md Ebaadur Rahamn", 940.75));
		bookList.add(new Book(503, "Pro Angular", 260, "Sadia Alam", 1949.25));
		bookList.add(new Book(504, "HTML CSS", 100, "Md Mustaque Alam", 2317.09));
		bookList.add(new Book(505, "Hibernate in Action", 180, "Hemchand Matho", 889.25));

		return bookList;
	}

	public static void main(String args[]) {
		TestClassMe d = new TestClassMe();
		d.square(4);
		// default method executed
		d.show();
		TestInterFace.show1();
		List<Book> bookList = getBookList();
		// bookList.stream().sorted((book1, book2) ->
		// book1.getName().compareToIgnoreCase(book2.getName()));
		List<Book> bookByName = bookList.stream().sorted().collect(Collectors.toList());
		bookByName.forEach(System.out::println);

		Comparator<Book> sortByName = (b1, b2) -> b1.getName().compareToIgnoreCase(b2.getName());
		Comparator<Book> sortByAuthor = (b1, b2) -> b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
		Comparator<Book> sortByCost = (b1, b2) -> Double.compare(b1.getCost(), b2.getCost());

		// Sort by Name then Sort by Author then sort by Cost
		bookList.stream().sorted(sortByName.thenComparing(sortByAuthor).thenComparing(sortByCost));
		bookList.forEach(System.out::println);
		List<Manager> manger = Arrays.asList(new Manager("google", new DepartMent("IT", "IT01")),
				new Manager("google", new DepartMent("IT", "IT02")), new Manager("Apple", new DepartMent("CS", "CS01")),
				new Manager("Apple", new DepartMent("CS", "CS02")), new Manager("SONY", new DepartMent("CS", "CS03")),
				new Manager("SONY", new DepartMent("CS", "CS04")), new Manager("Ipad", new DepartMent("CS", "CS05")),
				new Manager("Xomi", new DepartMent("CS", "CS06")));
		List<DepartMent> dep = manger.stream().filter(man -> man.getDepartment().getDepName().startsWith("IT"))
				.map(man -> man.getDepartment()).collect(Collectors.toList());
		dep.stream().sorted(Comparator.comparing(DepartMent::getDepName)).collect(Collectors.toList());
		dep.sort(Comparator.comparing(DepartMent::getDepName).thenComparing(DepartMent::getDepCode));
		// dep.stream().forEach(System.out::println);
		Map<DepartMent, List<Manager>> manMap = manger.stream()
				.filter(man -> man.getDepartment().getDepName().startsWith("IT"))
				.collect(Collectors.groupingBy(Manager::getDepartment));

		// manMap.forEach((key, value) -> System.out.println("DepartMent :" + key +
		// "ManagerList" + value));

		Map<String, List<Manager>> employeesMap = manger.stream().collect(Collectors.groupingBy(Manager::getName));
		// employeesMap.forEach((key, value) -> System.out.println("MangerKey : " + key
		// + " ManagerList :" + value));
		Map<String, List<Manager>> mapByName = manger.stream().collect(Collectors.groupingBy(Manager::getName));
		// mapByName.forEach((key, value) -> System.out.println("mapByName : " + key + "
		// mapByNameManagerList :" + value));
		List<Manager> shortedList = new ArrayList<Manager>();
		mapByName.forEach((key, value) -> {

			shortedList.addAll(value);
		});
		PageUtil.returnPage(shortedList, 1);

		// shortedList.forEach(System.out::println);

		Map<DepartMent, Manager> mangerByDepart = manger.stream()
				.collect(Collectors.toMap(Manager::getDepartment, man -> man));

		// mangerByDepart
		// .forEach((key, value) -> System.out.println("mangerByDepart : " + key + "
		// mangerByDepart :" + value));

	}
}