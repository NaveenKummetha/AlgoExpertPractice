package com.algo.expert.practice.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
	public static void main(String[] args) {
		int[] aa = { 1, 2, 5, 3 };
		System.out.println(solution(aa));
	}

	private static int solution(int[] arr) {
		Arrays.sort(arr);
		int maxSUm = 0;
		for (int i : arr) {
			if (i > maxSUm + 1) {
				return maxSUm + 1;
			}
			maxSUm += i;
		}
		return maxSUm + 1;
	}
}
