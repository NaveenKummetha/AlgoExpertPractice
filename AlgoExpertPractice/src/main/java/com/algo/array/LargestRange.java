package com.algo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestRange {
	public static void main(String[] args) {
//		int[] array = { 1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6 };
//		int[] array = { 19, -1, 18, 17, 2, 10, 3, 12, 5, 16, 4, 11, 8, 7, 6, 15, 12, 12, 2, 1, 6, 13, 14 };
		int[] array = { 1, 1, 1, 1, 1 };
		largestRange2(array);

	}

	public static int[] largestRange2(int[] array) {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for (int num : array) {
			map.put(num, true);
		}
		int maxWidth = 0;
		int[] res = new int[2];
		for (int num : array) {
			if (!map.get(num)) {
				continue;
			}
			map.put(num, false);
			int innerWidth = 1;
			int left = num, right = num;
			while (map.containsKey(right + 1)) {
				innerWidth++;
				right += 1;
				map.put(right, false);
			}
			while (map.containsKey(left - 1)) {
				innerWidth++;
				left -= 1;
				map.put(left, false);
			}
			if (maxWidth < innerWidth) {
				maxWidth = innerWidth;
				res[0] = left;
				res[1] = right;
			}
		}
		return res;

	}

	// This method fails for {1,1,1,1,1} array in
	public static int[] largestRange(int[] array) {
		if (array.length < 2) {
			return new int[] { array[0], array[0] };
		}
		Arrays.sort(array);
		int maxVal = Integer.MIN_VALUE;
		int start = 0;
		int first = 0, last = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				last++;
				continue;
			}
			if (array[i] + 1 == array[i + 1]) {
				last++;
				if (maxVal < last - first) {
					maxVal = last - first;
					start = first;
				}

			} else {
				first = i + 1;
				last = i + 1;
			}
		}
		return new int[] { array[start], array[start + maxVal] };
	}

}
