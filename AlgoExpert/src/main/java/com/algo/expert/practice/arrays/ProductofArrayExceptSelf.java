package com.algo.expert.practice.arrays;

public class ProductofArrayExceptSelf {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
//		int[] a = {5,4,3,2,1};
		productExceptSelf2(a);
	}

	public static int[] productEwxceptSelf1(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		res[0] = 1;
		for (int i = 0, temp = 1; i < n - 1; i++) {
			res[i] = temp;
			temp *= nums[i];
		}

		for (int i = 0, temp = 1; i < n - 1; i++) {
			res[i] *= temp;
			temp *= nums[i];
		}
		return res;
	}

	public static int[] productExceptSelf2(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result;
	}
}
