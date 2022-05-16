package com.algo.sorting;

public class SelectionSort {
	public static void main(String[] args) {

	}

	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					min = j + 1;
				}
			}
			swap(array, min, i);
		}

		return array;
	}

	private static void swap(int[] array, int i, int j) {
		int val1 = array[i];
		array[i] = array[j];
		array[j] = val1;
	}
}
