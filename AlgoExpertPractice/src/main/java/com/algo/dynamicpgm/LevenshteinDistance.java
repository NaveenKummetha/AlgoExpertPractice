package com.algo.dynamicpgm;

public class LevenshteinDistance {

	public static int levenshteinDistance(String str1, String str2) {
		int[][] arr = new int[str2.length() + 1][str1.length() + 1];
		for (int i = 0; i < str2.length() + 1; i++) {
			arr[i][0] = i;
		}
		for (int j = 0; j < str1.length() + 1; j++) {
			arr[0][j] = j;
		}

		for (int i = 1; i < str2.length() + 1; i++) {
			for (int j = 1; j < str1.length() + 1; j++) {
				if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1];
				} else {
					arr[i][j] = 1 + Math.min(arr[i - 1][j - 1], Math.min(arr[i - 1][j], arr[i][j - 1]));
				}
			}
		}
		return arr[str2.length()][str1.length()];
	}
}