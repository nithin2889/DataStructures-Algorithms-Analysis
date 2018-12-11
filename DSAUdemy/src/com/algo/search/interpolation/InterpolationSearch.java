package com.algo.search.interpolation;

import com.algo.search.interpolation.DataSet;

public class InterpolationSearch {

	public static void main(String[] args) {
		DataSet ds = new DataSet(1000000);
		int search = 90;
		Boolean isFound = false;

		int low = 0;
		int high = ds.getDataSetSize() - 1;

		interpolationSearch(ds, low, high, search, isFound);
	}

	private static void interpolationSearch(DataSet ds, int low, int high, int search, Boolean isFound) {
		while (!isFound) {
			// when you search the whole length of the array and could not find anything you
			// need to terminate your program.
			if (low > high) {
				System.out.println("Element not found");
				break;
			}

			int mid = low + ((high - low) / (ds.data[high] - ds.data[low])) * (search - ds.data[low]);
			ds.numberOfTry++;

			if (ds.data[mid] == search) {
				System.out.println("Number found after " + ds.numberOfTry + " tries and the number is " + search);
				break;
			}

			if (ds.data[mid] < search) {
				low = mid + 1;
			}

			if (ds.data[mid] > search) {
				high = mid - 1;
			}
		}
	}

}