package com.algo.sort.quick;

public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low > high) {
			return;
		}

		int i = low;
		int j = high;
		int mid = low + (high - low) / 2;
		int pivot = arr[mid];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}

	public static void main(String[] args) {
		int[] arr = {6, 8, 2, 4, 3, 8, 1};
		
		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		QuickSort.quickSort(arr, 0, arr.length-1);
		
		System.out.println("\nAfter Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}