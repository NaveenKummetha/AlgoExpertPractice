package com.algo.expert.practice.arrays;

public class ValidMountainArray {
//	private static boolean solution(int[] arr) {
//		int start = 0;
//		int end = arr.length - 1;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i + 1] > arr[i]) {
//				start++;
//			} else if (arr[i + 1] < arr[i]) {
//				end--;
//			}
//		}
//		return start == end;
//	}

	public boolean validMountainArray_1(int[] arr) {
		if (arr.length < 3)
			return false;
		int l = 0;
		int r = arr.length - 1;
		while (l + 1 < arr.length - 1 && arr[l] < arr[l + 1])
			l++;
		while (r - 1 > 0 && arr[r] < arr[r - 1])
			r--;
		return l == r;
	}

	public boolean validMountainArray(int[] A) {

		if (A.length < 3)
			return false;

		int n = A.length, L = 0, R = n - 1;
		while (L < n - 1) {
			if (A[L] < A[L + 1])
				L++;
			else
				break;
		}

		if (L == n - 1)
			return false; // only strictly increasing -> 0 1 2 5 6 8 9

		while (R > 0) {
			if (A[R] < A[R - 1])
				R--;
			else
				break;
		}

		if (R == 0)
			return false; // only strictly decreasing -> 9 6 5 3 2 1 0

		return L == R;
	}

	public boolean validMountainArray3(int[] arr) {
		int i = 0, j = arr.length - 1; // i forward pointer ,j backward
		while (i < arr.length - 1 && arr[i] < arr[i + 1])
			i++; // increase i untill the next value is decreased
		while (j > 0 && arr[j - 1] > arr[j])
			j--; // decrease j untill the next value is decreased from back
		return i > 0 && j < arr.length - 1 && i == j; // return if i and j are equal
	}
}
