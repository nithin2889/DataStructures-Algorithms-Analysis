package com.algo.search.linear;

public class DataSet {

	int[] data;
	int numberOfTry;

	public DataSet(int size) {
		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i-1] = i;
		}
		numberOfTry = 0;
	}

	public int getDataSetSize() {
		return data.length;
	}
	
}