package com.algo.sorting;

public class InsertionSort {
	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				swap(array, j);
				j--;
			}
		}
		return array;
	}

	private static void swap(int[] array, int j) {
		int val1 = array[j - 1];
		array[j - 1] = array[j];
		array[j] = val1;
	}
}
