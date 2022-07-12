package com.leetcode.DataStructure._14Days._1stDay;

/**
 * https://www.baeldung.com/java-maximum-subarray
 * 
 */
// Java program to print largest contiguous array sum
import java.util.*;

public class MaximumSubarray {
	public static void main(String[] args) {
		int[] a = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySumIndices(a));
	}

	// Brute Force Algorithm solution 1
	static int maxSubArraySum(int nums[]) {
		int n = nums.length;
		int maximumSubArraySum = Integer.MIN_VALUE;

		for (int left = 0; left < n; left++) {

			int runningWindowSum = 0;

			for (int right = left; right < n; right++) {
				runningWindowSum += nums[right];

				if (runningWindowSum > maximumSubArraySum) {
					System.out.println(runningWindowSum + " " + left + " " + right);
					maximumSubArraySum = runningWindowSum;
				}
			}
		}
		return maximumSubArraySum;
	}

	// solution 2
	private static int maxSUbArr(int nums[]) {
		int max = 0;
		for (int left = 0; left < nums.length; left++) {
			int sum = 0;
			for (int right = left; right < nums.length; right++) {
				sum += nums[right];
				if (max < sum) {
					max = sum;
				}
			}

		}
		return max;
	}

	static int maxSubArraySum3(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here > max_so_far)
				max_so_far = max_ending_here;
			if (0 > max_ending_here)
				max_ending_here = 0;
			System.out.println(max_ending_here);
		}
		return max_so_far;
	}

	static int maxSubArraySumIndices(int a[]) {
		int size = a.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		int start = 0, end = 0, s = 0;
		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_ending_here > max_so_far) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (0 > max_ending_here) {
				max_ending_here = 0;
				s = i + 1;
			}

		}
		System.out.println(start + " " + end);
		return max_so_far;
	}
}
