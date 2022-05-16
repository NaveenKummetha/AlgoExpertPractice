package com.algo.expert.practice.arrays;

public class MoveElementToEnd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 2, 5, 2, 6, 78, 9 };
		for (int i : solution(arr, 2)) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] arr, int mov) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			while (arr[left] != mov && left < right) {
				left++;
			}
			while (arr[right] == mov && left < right) {
				right--;
			}

			if (left > right) {
				break;
			}
			int val = arr[left];
			arr[left] = arr[right];
			arr[right] = val;
			left++;
			right--;
		}
		return arr;
	}
}
