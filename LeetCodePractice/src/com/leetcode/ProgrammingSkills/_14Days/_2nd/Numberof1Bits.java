package com.leetcode.ProgrammingSkills._14Days._2nd;

public class Numberof1Bits {
	public static void main(String[] args) {
		hammingWeight1(0010100101010);
	}

	// you need to treat n as an unsigned value
	public static int hammingWeight1(int n) {
		return Integer.bitCount(n);

	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count = count + (n & 1);
			n = n >>> 1;
		}
		return count;
	}
}
