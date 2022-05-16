package com.algo.expert.practice.arrays;

//https://github.com/pinglu85/algoExpert/blob/main/Medium/smallest-difference.md
import java.util.Arrays;

public class SmallestDifference {
	public static void main(String[] args) {
		int[] arrayOne = { -1, 3, 5, 10, 20, 28 };
		int[] arrayTwo = { 15, 17, 26, 134, 135, 28 };
		System.out.println(solution(arrayOne, arrayTwo)[0]);
		System.out.println(solution(arrayOne, arrayTwo)[1]);
	}

	private static int[] solution(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int indexOne = 0;
		int indexTwo = 0;
		int mindiff = Integer.MAX_VALUE;
		int[] smallest = new int[2];
		while (indexOne < a.length || indexTwo < b.length) {
			System.out.println("Hello");
			int diff = Math.abs(a[indexOne] - b[indexTwo]);
			if (diff < mindiff) {
				mindiff = diff;
				smallest[0] = a[indexOne];
				smallest[1] = b[indexTwo];
			}
			if (a[indexOne] < b[indexTwo]) {
				indexOne++;
			} else if (a[indexOne] > b[indexTwo]) {
				indexTwo++;
			} else {
				smallest[0] = a[indexOne];
				smallest[1] = b[indexTwo];
				return smallest;
			}

		}

		return smallest;
	}

}
