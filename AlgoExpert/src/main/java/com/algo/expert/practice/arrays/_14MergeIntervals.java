package com.algo.expert.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _14MergeIntervals {
	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 2, 7 }, { 9, 18 } };
		merger2(arr);
	}

	static int[][] merger2(int[][] arr) {
		Arrays.sort(arr, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> list = new ArrayList<int[]>();
		int[] start = arr[0];
		list.add(start);
		for (int[] is : arr) {
			if (start[0] >= is[1]) {
				start[1] = Math.max(start[1], is[1]);
			} else {
				start = is;
				list.add(start);
			}

		}
		int[][] arr2 = list.toArray(new int[list.size()][]);
		return arr;

	}

	public static int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;

		// Sort by ascending starting point
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
		result.add(newInterval);
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1]) // Overlapping intervals, move the end if needed
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else { // Disjoint intervals, add the new interval to the list
				newInterval = interval;
				result.add(newInterval);
			}
		}
		int[][] arr2 = result.toArray(new int[result.size()][]);
		return arr2;
	}
}
