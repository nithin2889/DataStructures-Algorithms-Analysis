package com.algo.sort.selection;

public class SelectionSorting {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i; // considering the element at the first index as the smallest.
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			if(index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 8, 5, 3, 10, 6, 15};
		
		System.out.println("Before Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		SelectionSorting.selectionSort(arr);
		
		System.out.println("\nAfter Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}