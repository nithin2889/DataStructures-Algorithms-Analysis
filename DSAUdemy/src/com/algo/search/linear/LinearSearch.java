package com.algo.search.linear;

public class LinearSearch {

	public static void main(String[] args) {
		DataSet ds = new DataSet(1000000);
		int searchElement = 0;
		Boolean isFound = false;

		for (int i = 0; i < ds.getDataSetSize(); i++) {
			ds.numberOfTry++;
			if (ds.data[i] == searchElement) {
				System.out.println("Element found after " + ds.numberOfTry + " tries.");
				isFound = true;
				break;
			}
		}
		
		if(isFound == false) {
			System.out.println("Element not found.");
		}
	}

}