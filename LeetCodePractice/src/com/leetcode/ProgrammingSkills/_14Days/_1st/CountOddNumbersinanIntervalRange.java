package com.leetcode.ProgrammingSkills._14Days._1st;

public class CountOddNumbersinanIntervalRange {
	public int countOdds(int low, int high) {
		if (low % 2 == 0 && high % 2 == 0) {
			return (high - low) / 2;
		} else {
			return ((high - low) / 2) + 1;
		}

	}

	public int countOdds1(int low, int high) {
		int ans = (high - low) / 2;
		if (low % 2 == 1 || high % 2 == 1)
			ans++;
		return ans;

	}
}
