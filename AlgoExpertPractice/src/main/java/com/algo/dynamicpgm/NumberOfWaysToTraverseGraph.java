package com.algo.dynamicpgm;

public class NumberOfWaysToTraverseGraph {
	public static void main(String[] args) {
		numberOfWaysToTraverseGraph(3, 4);
	}

	public static int numberOfWaysToTraverseGraph(int width, int height) {
		int[][] arr = new int[width][height];
		for (int hieghtIndex = 0; hieghtIndex < width; hieghtIndex++) {
			for (int widthIndex = 0; widthIndex < height; widthIndex++) {
				if (hieghtIndex == 0 || widthIndex == 0) {
					arr[hieghtIndex][widthIndex] = 1;
				} else {
					arr[hieghtIndex][widthIndex] = arr[hieghtIndex][widthIndex - 1] + arr[hieghtIndex - 1][widthIndex];
				}
			}
		}
		return arr[width-1][height-1];
	}
}
