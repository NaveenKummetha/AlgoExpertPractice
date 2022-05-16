package com.algo.expert.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		// [[1,2,3],[4,5,6],[7,8,9]]
		//
//		int[][] aa = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] aa = { { 1, 11 }, { 2, 12 }, { 3, 13 }, { 4, 14 }, { 5, 15 }, { 6, 16 }, { 7, 17 }, { 8, 18 },
				{ 9, 19 }, { 10, 20 } };
		System.out.println(Arrays.asList(spiralOrder(aa)));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		List<Integer> aa = new ArrayList<Integer>();
		int top = 0;
		int bottom = m - 1;
		int left = 0;
		int right = n - 1;
		int count = 0;
		while (true) {
			for (int i = left; i <= right; i++) {
				aa.add(matrix[top][i]);
			}
			top++;
			if (top > bottom) {
				break;
			}
			for (int i = top; i <= bottom; i++) {
				aa.add(matrix[i][right]);
			}

			right--;
			if (right < left) {
				break;
			}
			for (int i = right; i >= left; i--) {
				aa.add(matrix[bottom][i]);
			}
			bottom--;
			if (top > bottom) {
				break;
			}
			for (int i = bottom; i >= top; i--) {
				aa.add(matrix[i][left]);
			}
			left++;
			if (right < left) {
				break;
			}
			
		}

		return aa;

	}

	public List<Integer> SpiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		List<Integer> spiral = new ArrayList<Integer>();
		int top = 0, bottom = m - 1, left = 0, right = n - 1, count = 0;
		while (true) {
			// Go right
			for (int i = left; i <= right; i++)
				spiral.add(matrix[top][i]);
			top++;
			if (top > bottom)
				break;

			// Go down
			for (int i = top; i <= bottom; i++)
				spiral.add(matrix[i][right]);
			right--;
			if (right < left)
				break;

			// Go left
			for (int i = right; i >= left; i--)
				spiral.add(matrix[bottom][i]);
			bottom--;
			if (top > bottom)
				break;

			// Go up
			for (int i = bottom; i >= top; i--)
				spiral.add(matrix[i][left]);
			left++;
			if (right < left)
				break;
		}

		return spiral;
	}
}
