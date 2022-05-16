package com.algo.graphs;

public class SingleCycleCheck {
	public static boolean hasSingleCycle(int[] array) {
		int nofRecords = 0;
		int currentIndex = 0;
		while (nofRecords < array.length) {
			if (nofRecords > 0 && currentIndex != 0) {
				return false;
			}
			nofRecords++;
			currentIndex = getNextIndex(currentIndex, array);
		}
		return false;
	}

	private static int getNextIndex(int current, int[] arr) {
		int jump = arr[current];
		int nextInt = (current + jump) % arr.length;
		return nextInt >= 0 ? nextInt : nextInt + arr.length;
	}
}
