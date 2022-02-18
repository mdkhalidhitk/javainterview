package com.pagination.skip.limit;

import java.util.List;
import java.util.stream.Collectors;

import com.java.stream.api.Manager;

public class PageUtil {

	public static Page<Manager> returnPage(List<Manager> activities, int pageNumber) {
		int skipCount = (pageNumber - 1) * Page.RESULTS_PER_PAGE;

		List<Manager> activityPage = activities.stream().skip(skipCount).limit(Page.RESULTS_PER_PAGE)
				.collect(Collectors.toList());

		Page<Manager> pageLimt = new Page<>(pageNumber, activities.size(), activityPage);
		System.out.println(pageLimt);

		return pageLimt;
	}
}
