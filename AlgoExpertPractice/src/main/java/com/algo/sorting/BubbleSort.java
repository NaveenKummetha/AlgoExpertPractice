package com.algo.sorting;

public class BubbleSort {
	public static void main(String[] args) {

	}

	public static int[] bubbleSort(int[] array) {
		boolean val = true;
		while (val) {
			val = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					val = true;
					int val1 = array[i];
					array[i] = array[i + 1];
					array[i + 1] = val1;

				}
			}
		}
		return array;
	}
}
