package com.leetcode.DataStructure._14Days._4thDay;

public class ReshapetheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int m = nums.length, n = nums[0].length;
		if (m * n != r * c)
			return nums;

		int[][] result = new int[r][c];
		int row = 0, col = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[row][col] = nums[i][j];
				col++;
				if (col == c) {
					col = 0;
					row++;
				}
			}
		}

		return result;
	}

	public int[][] matrixReshape1(int[][] nums, int r, int c) {
		int n = nums.length, m = nums[0].length;
		if (r * c != n * m)
			return nums;
		int[][] res = new int[r][c];
		for (int i = 0; i < r * c; i++)
			res[i / c][i % c] = nums[i / m][i % m];
		return res;
	}
}
