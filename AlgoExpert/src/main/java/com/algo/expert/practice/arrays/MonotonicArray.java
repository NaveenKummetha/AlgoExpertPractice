package com.algo.expert.practice.arrays;

public class MonotonicArray {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 4, 1 };
//		int[] arr = { 4, 3, 2, 1,2 };
		System.out.println(solution(arr));
	}

	public static boolean solution(int[] arr) {
		boolean monIncrease = true;
		boolean monDec = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				continue;
			} else if (arr[i] > arr[i - 1]) {
				if (!monIncrease) {
					return false;
				}
				monDec = false;
			} else {
				if (!monDec) {
					return false;
				}
				monIncrease = false;
			}
		}
		return monDec || monIncrease;
	}

	public boolean isMonotonic(int[] arr) {
		if (arr.length == 1)
			return true;
		int n = arr.length;
		boolean up = (arr[n - 1] - arr[0]) > 0;
		for (int i = 0; i < n - 1; i++)
			if (arr[i + 1] != arr[i] && (arr[i + 1] - arr[i] > 0) != up)
				return false;
		return true;
	}

	public boolean isMonotonic_3(int[] A) {
		if (A == null || A.length <= 1)
			return true;
		int[] dir = new int[2];
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i - 1])
				continue;
			if (A[i] > A[i - 1])
				dir[0] = 1;
			if (A[i] < A[i - 1])
				dir[1] = 1;
			if (dir[0] == 1 && dir[1] == 1)
				return false;
		}
		return true;
	}
}
