package com.java.coding.qa;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 10, 11, 13 };
		int N = arr.length;
		printMissingElements(arr, N);
	}

	static void printMissingElements(int arr[], int N) {

// Initialize diff
		int diff = arr[0] - 0;

		for (int i = 0; i < N; i++) {
			int res = arr[i] - i;
// Check if diff and arr[i]-i
// both are equal or not
			if (arr[i] - i != diff) {

// Loop for consecutive
// missing elements
				while (diff < arr[i] - i) {
					System.out.print((i + diff) + " ");
					diff++;
				}
			}
		}
	}

}
