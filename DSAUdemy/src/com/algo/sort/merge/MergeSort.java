package com.algo.sort.merge;

public class MergeSort {

	int[] arr;
	int[] tempArr;

	public void prepareForSorting(int[] arr) {
		this.arr = arr;
		this.tempArr = new int[arr.length];
		doMergeSort(0, arr.length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int mid = lowerIndex + (higherIndex - lowerIndex) / 2;
			
			doMergeSort(lowerIndex, mid);
			doMergeSort(mid + 1, higherIndex);
			
			mergePart(lowerIndex, mid, higherIndex);
		}
	}

	// merges smaller problems and sorts
	private void mergePart(int lowerIndex, int mid, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempArr[i] = arr[i];
		}
		int i = lowerIndex;
		int j = mid + 1;
		int k = lowerIndex;
		
		while (i <= mid && j <= higherIndex) {
			if(tempArr[i] <= tempArr[j]) {
				arr[k] = tempArr[i];
				i++;
			} else {
				arr[k] = tempArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			arr[k] = tempArr[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 8, 7, 4, 3, 2, 5, 9};
		
		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		new MergeSort().prepareForSorting(arr);
		
		System.out.println("\nAfter Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}