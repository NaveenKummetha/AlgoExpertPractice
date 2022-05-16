package com.algo.array;

import java.util.*;

/*
 * Write a function that takes in an array of at least two integers and that returns an array of the starting and ending indices of the smallest subarray in the input array that needs to be sorted in place in order for the entire input array to be sorted (in ascending order).

If the input array is already sorted, the function should return [-1, -1].


** Sample Input
------------------------------------------------------------
array = [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19]


** Sample Output
------------------------------------------------------------
[3, 9]
 */
public class ValidateSubsequence {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19 };
		subarraySort(array);
	}

	public static int[] subarraySort(int[] array) {
		int minVal = Integer.MAX_VALUE;
		int maXVal = Integer.MIN_VALUE;
		int leftVal = -1;
		int rightVal = -1;
		int j = 0;
		while (j < array.length - 1) {
			if (array[j] > array[j + 1]) {
				if (minVal > array[j + 1]) {
					minVal = array[j + 1];
				}
				if (maXVal < array[j]) {
					maXVal = array[j];
				}
			}
			j++;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > minVal && leftVal == -1) {
				leftVal = i;
			}
			if (array[array.length - i - 1] < maXVal && rightVal == -1) {
				rightVal = array.length - i-1;
			}
		}
		return new int[] { leftVal, rightVal };
	}
}
