package com.leetcode.DataStructure._14Days._6thDay;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
	public static void main(String[] args) {
		System.out.println(firstUniqChar("dddccdbba"));
	}

	public static int firstUniqChar3(String s) {
		int freq[] = new int[26];
		for (char i : s.toCharArray())
			freq[i - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}

	public static int firstUniqChar2(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		// find the index
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

	public static int firstUniqChar1(String s) {

		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}

	public static int firstUniqChar(String s) {

		int ans = Integer.MAX_VALUE;
		for (char i = 'a'; i <= 'z'; i++) {
			int ind = s.indexOf(i);
			if (ind != -1 && ind == s.lastIndexOf(i))
				ans = Math.min(ans, ind);
		}
		if (ans == Integer.MAX_VALUE)
			return -1;
		return ans;
	}
}
