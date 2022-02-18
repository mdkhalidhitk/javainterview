package com.pagination.skip.limit;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Page<T> {

	public static final int RESULTS_PER_PAGE = 3;

	private Integer pageNumber;
	private Integer resultsPerPage;
	private Integer totalResults;
	private List<T> items;

	public Page(Integer pageNumber, Integer totalResults, List<T> items) {
		this.pageNumber = pageNumber;
		this.resultsPerPage = RESULTS_PER_PAGE;
		this.totalResults = totalResults;
		this.items = items;
	}

}
