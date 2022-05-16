package com.algo.expert.practice.arrays;

//Leet code 845. Longest Mountain in Array
public class LongestMountaininArray {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3, 4, 3, 3, 1, 2, 3, 2, 1 };
		System.out.println(longestMount1(arr));
	}

	// Written by me for practice
	private static int longestMount1(int[] arr) {
		int n = arr.length;
		int max = 0;
		int i = 0;
		int upStack = 0;
		int downStack = 0;
		while (i < n - 1) {
			upStack = i;
			while (i < n - 1 && arr[i] < arr[i + 1]) {
				++i;
			}
			if (i == upStack) {
				++i;
				continue;
			}
			downStack = i;
			while (i < n - 1 && arr[i] > arr[i + 1]) {
				++i;
			}
			if (i == downStack) {
				++i;
				continue;
			}
			max = Math.max(max, i - upStack + 1);
		}
		return max;
	}

	// Written by me for practice
	private static int longestMount(int[] arr) {
		int n = arr.length;
		int max = 0;
		int[] down = new int[n];
		int[] up = new int[n];
		for (int i = n - 1, j = 1; j < n - 1; i--, j++) {
			if (arr[i] < arr[i - 1]) {
				down[i - 1] = down[i] + 1;
			}
			if (arr[j] > arr[j - 1]) {
				up[j] = up[j - 1] + 1;
			}
		}

		for (int i = 0; i < up.length; i++) {
			if (up[i] > 0 && down[i] > 0) {
				max = Math.max(max, up[i] + down[i] + 1);
			}

		}
		return max;

	}

	public static int longestMountain(int[] A) {
		int N = A.length, res = 0;
		int[] up = new int[N], down = new int[N];
		for (int i = N - 2; i >= 0; --i)
			if (A[i] > A[i + 1])
				down[i] = down[i + 1] + 1;
		for (int i = 0; i < N; ++i) {
			if (i > 0 && A[i] > A[i - 1])
				up[i] = up[i - 1] + 1;
			if (up[i] > 0 && down[i] > 0)
				res = Math.max(res, up[i] + down[i] + 1);
		}
		return res;
	}

	public static int longestMountain_1(int[] A) {
		int n = A.length;
		int maxLen = 0;
		int i = 0;
		while (i < n - 1) {
			int upStart = i;
			// Go up
			while (i < n - 1 && A[i] < A[i + 1])
				++i;
			if (i == upStart) { // does not move
				++i;
				continue;
			} // i stops the peek
				// Go down
			int downStart = i;
			while (i < n - 1 && A[i] > A[i + 1])
				++i;
			if (i == downStart) {
				++i;
				continue;
			} // i stops at the last in the subarray
				// Update length
			int len = i - upStart + 1;
			maxLen = Math.max(maxLen, len);
		}
		return maxLen;
	}

	public int longestMountain_2(int[] A) {
		int n = A.length;
		int[] inc = new int[n]; // init with 0
		int[] dec = new int[n];
		for (int i = 1, j = n - 2; i < n; ++i, --j) {
			if (A[i - 1] < A[i])
				inc[i] = inc[i - 1] + 1;
			if (A[j] > A[j + 1])
				dec[j] = dec[j + 1] + 1;
			// otherwise, keep it 0
		}
		// for each possible peak
		int maxLen = 0;
		for (int i = 1; i < n - 1; ++i) {
			if (inc[i] > 0 && dec[i] > 0) {
				maxLen = Math.max(maxLen, inc[i] + dec[i] + 1);
			}
		}
		return maxLen;
	}
}
