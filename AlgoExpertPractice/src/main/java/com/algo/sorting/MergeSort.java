package com.algo.sorting;

import java.util.Arrays;

public class MergeSort {
	public static int[] mergeSort(int[] array) {
		return mergeSort2(array);
	}

	private static int[] mergeSort2(int[] array) {
		if (array.length <= 1) {
			return array;
		}
		int mid = array.length / 2;
		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid, array.length);
		return mergeSortedArrays(mergeSort2(left), mergeSort2(right));

	}

	public static int[] mergeSortedArrays(int[] leftHalf, int[] rightHalf) {
		int[] sortedArray = new int[leftHalf.length + rightHalf.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < leftHalf.length && j < rightHalf.length) {
			if (leftHalf[i] <= rightHalf[j]) {
				sortedArray[k++] = leftHalf[i++];
			} else {
				sortedArray[k++] = rightHalf[j++];
			}
		}
		while (i < leftHalf.length) {
			sortedArray[k++] = leftHalf[i++];
		}
		while (j < rightHalf.length) {
			sortedArray[k++] = rightHalf[j++];
		}
		return sortedArray;
	}

}
