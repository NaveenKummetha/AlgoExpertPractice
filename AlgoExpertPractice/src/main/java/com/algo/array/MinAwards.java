package com.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class MinAwards {
//	Test Case 1
//	{
//	  "scores": [8, 4, 2, 1, 3, 6, 7, 9, 5]
//	}
//	Test Case 2
//	{
//	  "scores": [1]
//	}
//	Test Case 3
//	{
//	  "scores": [5, 10]
//	}
//	Test Case 4
//	{
//	  "scores": [10, 5]
//	}
//	Test Case 5
//	{
//	  "scores": [4, 2, 1, 3]
//	}
//	Test Case 6
//	{
//	  "scores": [0, 4, 2, 1, 3]
//	}
//	Test Case 7
//	{
//	  "scores": [2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0]
//	}
//	Test Case 8
//	{
//	  "scores": [2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
//	}
//	Test Case 9
//	{
//	  "scores": [800, 400, 20, 10, 30, 61, 70, 90, 17, 21, 22, 13, 12, 11, 8, 4, 2, 1, 3, 6, 7, 9, 0, 68, 55, 67, 57, 60, 51, 661, 50, 65, 53]
//	}
	public static void main(String[] args) {
		int[] arr = { 800, 400, 20, 10, 30, 61, 70, 90, 17, 21, 22, 13, 12, 11, 8, 4, 2, 1, 3, 6, 7, 9, 0, 68, 55, 67,
				57, 60, 51, 661, 50, 65, 53 };
		minRewards2(arr);
	}

	// This doesn't work
	public static int solution1(int[] scores) {
		// Copyright © 2022 AlgoExpert LLC. All rights reserved.
		int[] rewards = new int[scores.length];
		Arrays.fill(rewards, 1);
		for (int i = 1; i < scores.length; i++) {
			int j = i - 1;
			if (scores[i] > scores[j]) {
				rewards[i] = rewards[j] + 1;
			} else {
				while (j >= 0 && scores[j] > scores[j + 1]) {
					rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
					j--;
				}
			}
		}
		return IntStream.of(rewards).sum();
	}


	public static int minRewards(int[] scores) {
		int res = 0;
		int forwardPrev = 0;
		int reversePrev = 0;
//		int[] arrVal = new int[scores.length];
		for (int i = 1; i < scores.length - 1; i++) {
			if (scores[i] < scores[i + 1]) {
				res += (forwardPrev);
				forwardPrev++;
			} else {
				forwardPrev = 0;
			}
			if (scores[scores.length - i - 1] < scores[scores.length - i - 2]) {
				res += (reversePrev);
				reversePrev++;
			} else {
				reversePrev = 0;
			}
			res += 2;

		}
		return res;
	}

	public static int minRewards2(int[] scores) {
		int[] arrVal = new int[scores.length];
		arrVal[0] = 1;
		for (int i = 1; i < scores.length - 1; i++) {
			arrVal[i] = 1;
			if (scores[i] > scores[i - 1]) {
				arrVal[i] = Math.max(arrVal[i - 1] + 1, arrVal[i]);
			}
		}
		for (int i = scores.length - 2; i > 0; i--) {
			arrVal[i] = 1;
			if (scores[i] > scores[i + 1]) {
				arrVal[i] = Math.max(arrVal[i + 1] + 1, arrVal[i]);
			}
		}
//		Arrays.asList(null)
		return IntStream.of(arrVal).sum();
	}

	// O(n^2) time | O(n) space - where n is the length of the input array
	static class Program1 {
		public static int minRewards(int[] scores) {
			int[] rewards = new int[scores.length];
			Arrays.fill(rewards, 1);
			for (int i = 1; i < scores.length; i++) {
				int j = i - 1;
				if (scores[i] > scores[j]) {
					rewards[i] = rewards[j] + 1;
				} else {
					while (j >= 0 && scores[j] > scores[j + 1]) {
						rewards[j] = Math.max(rewards[j], rewards[j + 1] + 1);
						j--;
					}
				}
			}
			return IntStream.of(rewards).sum();
		}
	}

	// Copyright © 2022 AlgoExpert LLC. All rights reserved.
	// O(n) time | O(n) space - where n is the length of the input array
	static class Program2 {
		public static int minRewards(int[] scores) {
			int[] rewards = new int[scores.length];
			Arrays.fill(rewards, 1);
			List<Integer> localMinIdxs = getLocalMinIdxs(scores);
			for (Integer localMinIdx : localMinIdxs) {
				expandFromLocalMinIdx(localMinIdx, scores, rewards);
			}
			return IntStream.of(rewards).sum();
		}

		public static List<Integer> getLocalMinIdxs(int[] array) {
			List<Integer> localMinIdxs = new ArrayList<Integer>();
			if (array.length == 1) {
				localMinIdxs.add(0);
				return localMinIdxs;
			}
			for (int i = 0; i < array.length; i++) {
				if (i == 0 && array[i] < array[i + 1])
					localMinIdxs.add(i);
				if (i == array.length - 1 && array[i] < array[i - 1])
					localMinIdxs.add(i);
				if (i == 0 || i == array.length - 1)
					continue;
				if (array[i] < array[i + 1] && array[i] < array[i - 1])
					localMinIdxs.add(i);
			}
			return localMinIdxs;
		}

		public static void expandFromLocalMinIdx(int localMinIdx, int[] scores, int[] rewards) {
			int leftIdx = localMinIdx - 1;
			while (leftIdx >= 0 && scores[leftIdx] > scores[leftIdx + 1]) {
				rewards[leftIdx] = Math.max(rewards[leftIdx], rewards[leftIdx + 1] + 1);
				leftIdx--;
			}
			int rightIdx = localMinIdx + 1;
			while (rightIdx < scores.length && scores[rightIdx] > scores[rightIdx - 1]) {
				rewards[rightIdx] = rewards[rightIdx - 1] + 1;
				rightIdx++;
			}
		}
	}

	// Copyright © 2022 AlgoExpert LLC. All rights reserved.
	// O(n) time | O(n) space - where n is the length of the input array
	static class Program3 {
		public static int minRewards(int[] scores) {
			int[] rewards = new int[scores.length];
			Arrays.fill(rewards, 1);
			for (int i = 1; i < scores.length; i++) {
				if (scores[i] > scores[i - 1])
					rewards[i] = rewards[i - 1] + 1;
			}
			for (int i = scores.length - 2; i >= 0; i--) {
				if (scores[i] > scores[i + 1]) {
					rewards[i] = Math.max(rewards[i], rewards[i + 1] + 1);
				}
			}
			int k = 0;
			for (int i : rewards) {
				k +=i;
			}
			return k;
		}
	}

}
