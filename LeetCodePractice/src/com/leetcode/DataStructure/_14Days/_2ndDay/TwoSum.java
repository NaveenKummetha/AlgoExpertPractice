package com.leetcode.DataStructure._14Days._2ndDay;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> aa = new HashMap();
		int l = 0;

		for (int i = 0; i < nums.length; i++) {
			if (aa.containsKey(target - nums[i])) {
				return new int[] { aa.get(target - nums[i]), i };
			}
			aa.put(nums[i], i);
		}
		return nums;

	}
}
