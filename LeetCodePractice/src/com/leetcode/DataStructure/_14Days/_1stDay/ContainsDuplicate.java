/**
 * 
 */
package com.leetcode.DataStructure._14Days._1stDay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author navekumm https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] aa = new int[] { 1, 2, 3, 1, 4, 3, 2, 4, 2, 3, 4, 4 };
		System.out.println(new ContainsDuplicate().containsDuplicate(aa));
	}

	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == nums[i + 1])
				return true;
		return false;
	}

	// Not working
	public boolean containsDuplicate1(int[] nums) {
		byte[] mark = new byte[150000];
		for (int i : nums) {
			int j = i / 8;
			int k = i % 8;
			int check = 1 << k;
			if ((mark[j] & check) != 0) {
				return true;
			}
			mark[j] |= check;
		}
		return false;
	}

	public boolean containsDuplicate2(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i : nums)
			if (!set.add(i))// if there is same
				return true;
		return false;
	}
}
