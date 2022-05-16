package com.algo.array;

import java.util.ArrayList;
import java.util.List;

//Test Case 1
//{
//  "array": [
//    [1, 3, 4, 10],
//    [2, 5, 9, 11],
//    [6, 8, 12, 15],
//    [7, 13, 14, 16]
//  ]
//}
//Test Case 2
//{
//  "array": [
//    [1]
//  ]
//}
//Test Case 3
//{
//  "array": [
//    [1, 2, 3, 4, 5]
//  ]
//}
//Test Case 4
//{
//  "array": [
//    [1],
//    [2],
//    [3],
//    [4],
//    [5]
//  ]
//}
//Test Case 5
//{
//  "array": [
//    [1, 3],
//    [2, 4],
//    [5, 7],
//    [6, 8],
//    [9, 10]
//  ]
//}
//Test Case 6
//{
//  "array": [
//    [1, 3, 4, 7, 8],
//    [2, 5, 6, 9, 10]
//  ]
//}
//Test Case 7
//{
//  "array": [
//    [1, 3, 4, 10, 11],
//    [2, 5, 9, 12, 19],
//    [6, 8, 13, 18, 20],
//    [7, 14, 17, 21, 24],
//    [15, 16, 22, 23, 25]
//  ]
//}
//Test Case 8
//{
//  "array": [
//    [1, 3, 4, 10, 11, 20],
//    [2, 5, 9, 12, 19, 21],
//    [6, 8, 13, 18, 22, 27],
//    [7, 14, 17, 23, 26, 28],
//    [15, 16, 24, 25, 29, 30]
//  ]
//}
//Test Case 9
//{
//  "array": [
//    [1, 3, 4, 10, 11],
//    [2, 5, 9, 12, 20],
//    [6, 8, 13, 19, 21],
//    [7, 14, 18, 22, 27],
//    [15, 17, 23, 26, 28],
//    [16, 24, 25, 29, 30]
//  ]
//}
//Test Case 10
//{
//  "array": [
//    [1, 21, -3, 4, 15, 6, -7, 88, 9],
//    [10, 11, 112, 12, 20, -1, -2, -3, -4],
//    [6, 8, 113, 19, 21, 0, 0, 0, 0],
//    [7, 2, 18, 22, -27, 12, 32, -111, 66],
//    [15, 17, 23, 226, 28, -28, -226, -23, -17],
//    [16, 24, 27, 299, 30, 29, 32, 31, 88]
//  ]
//}
public class ZigzagTraverse {
	public static void main(String[] args) {

	}

	// written by me for practice
	private void trverse(List<List<Integer>> array) {
		int col = 0;
		int row = 0;
		int height = array.size() - 1;
		int width = array.get(0).size() - 1;
		List<Integer> res = new ArrayList<Integer>();
		boolean goingDown = true;
		while (!validatePath(row, col, height, width)) {
			res.add(array.get(row).get(col));
			if (goingDown) {
				if (col == 0 || row == height) {
					goingDown = false;
					if (row == height) {
						col++;
					} else {
						row++;
					}
				} else {
					row++;
					col--;
				}
			} else {
				if (row == 0 || col == height) {
					goingDown = true;
					if (col == height) {
						row++;
					} else {
						col++;
					}
				} else {
					row--;
					col++;
				}
			}
		}

	}

	private boolean validatePath(int col, int row, int hieght, int width) {
		// TODO Auto-generated method stub
		return row < 0 || row > hieght || col < 0 || col > width;
	}

	// Copyright © 2022 AlgoExpert LLC. All rights reserved.

// O(n) time | O(n) space - where n is the total number of elements in the
// two-dimensional array
	static class Program {
		public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
			int height = array.size() - 1;
			int width = array.get(0).size() - 1;
			List<Integer> result = new ArrayList<Integer>();
			int row = 0;
			int col = 0;
			boolean goingDown = true;
			while (!isOutOfBounds(row, col, height, width)) {
				result.add(array.get(row).get(col));
				if (goingDown) {
					if (col == 0 || row == height) {
						goingDown = false;
						if (row == height) {
							col++;
						} else {
							row++;
						}
					} else {
						row++;
						col--;
					}
				} else {
					if (row == 0 || col == width) {
						goingDown = true;
						if (col == width) {
							row++;
						} else {
							col++;
						}
					} else {
						row--;
						col++;
					}
				}
			}
			return result;
		}

		public static boolean isOutOfBounds(int row, int col, int height, int width) {
			return row < 0 || row > height || col < 0 || col > width;
		}
	}

}
