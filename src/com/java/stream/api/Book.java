package com.java.stream.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Book implements Comparable<Book> {

	private Integer id;
	private String name;
	private Integer pages;
	private String author;
	private Double cost;

	@Override
	public int compareTo(Book o) {
		return this.id.intValue() - o.id.intValue();
	}

}
