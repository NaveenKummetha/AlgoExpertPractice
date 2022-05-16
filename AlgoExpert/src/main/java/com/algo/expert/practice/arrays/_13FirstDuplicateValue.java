package com.algo.expert.practice.arrays;

//https://www.geeksforgeeks.org/find-first-repeating-element-array-integers/
public class _13FirstDuplicateValue {

	
	static void printFirstRepeating(int[] arr, int n) {

		// This will set k=1, if any
		// repeating element found
		int k = 0;

		// max = maximum from (all elements & n)
		int max = n;
		for (int i = 0; i < n; i++)
			if (max < arr[i])
				max = arr[i];

		// Array a is for storing
		// 1st time occurrence of element
		// initialized by 0
		int[] a = new int[max + 1];

		// Store 1 in array b
		// if element is duplicate
		// initialized by 0
		int[] b = new int[max + 1];
		for (int i = 0; i < n; i++) {

			// Duplicate element found
			if (a[arr[i]] != 0) {
				b[arr[i]] = 1;
				k = 1;
				continue;
			} else
				// storing 1st occurrence of arr[i]
				a[arr[i]] = i + 1;
		}

		if (k == 0)
			System.out.println("No repeating element found");
		else {
			int min = max + 1;

			// trace array a & find repeating element
			// with min index
			for (int i = 0; i < max + 1; i++)
				if (a[i] != 0 && min > a[i] && b[i] != 0)
					min = a[i];
			System.out.print(arr[min - 1]);
		}
		System.out.println();
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };

		int n = arr.length;
		printFirstRepeating(arr, n);
	}

	// This code is contributed by divyesh072019

	// This wornt work
	static int firstDuplicate(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[Math.abs(a[i]) - 1] < 0)
				return Math.abs(a[i]);
			else
				a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
		}
		return -1;
	}

	private void solution(int[] arr) {

	}
}
