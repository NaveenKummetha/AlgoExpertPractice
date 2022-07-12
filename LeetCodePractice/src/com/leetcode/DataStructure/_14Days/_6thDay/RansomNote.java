package com.leetcode.DataStructure._14Days._6thDay;

public class RansomNote {
	public static void main(String[] args) {
		canConstruct("aa", "aab");
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] hash = new int[26];
		for (char c : magazine.toCharArray())
			++hash[c - 'a'];
		for (char c : ransomNote.toCharArray())
			if (--hash[c - 'a'] < 0)
				return false;
		return true;
	}

	public boolean canConstruct1(String ransomNote, String magazine) {
		int[] hash = new int[26];
		for (char c : magazine.toCharArray())
			++hash[c - 'a'];
		for (char c : ransomNote.toCharArray())
			if (--hash[c - 'a'] < 0)
				return false;
		return true;
	}
}
