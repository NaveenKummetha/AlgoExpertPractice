//https://leetcode.com/problems/valid-anagram/submissions/
package com.leetcode.DataStructure._14Days._6thDay;

public class ValidAnagram {
	public static void main(String[] args) {

	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] hash = new int[26];
		for (char c : s.toCharArray())
			++hash[c - 'a'];
		for (char c : t.toCharArray())
			if (--hash[c - 'a'] < 0)
				return false;
		return true;
	}

	public boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		for (int i : count) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

}
