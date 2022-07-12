package com.leetcode.DataStructure._14Days._3rdDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		intersect(nums1, nums2);
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();
		List<Integer> aa = new ArrayList<Integer>();
		int k = 0;
		if (nums1.length >= nums2.length) {
			for (int i : nums1) {
				if (val.containsKey(i)) {
					val.put(i, val.get(i) + 1);
				} else {
					val.put(i, 1);
				}
			}
			for (int i : nums2) {
				if (val.containsKey(i) && val.get(i) > 0) {
					aa.add(i);
					val.put(i, val.get(i) - 1);
				}
			}
		} else {
			for (int i : nums2) {
				if (val.containsKey(i)) {
					val.put(i, val.get(i) + 1);
				} else {
					val.put(i, 1);
				}
			}
			for (int i : nums1) {
				if (val.containsKey(i) && val.get(i) > 0) {
					aa.add(i);
					val.put(i, val.get(i) - 1);
				}
			}
		}
		int[] last = new int[aa.size()];
		for (int i = 0; i < aa.size(); i++) {
			last[i] = aa.get(i);
		}
		return last;
	}

}
