package com.algo.string;

public class Palindrom {
	public static boolean isPalindrome(String str) {
		return checkPalindrom(str, 0);
	}

	private static boolean checkPalindrom(String str, int i) {
		int j = str.length() - 1 - i;
		return i >= j ? true : str.charAt(i) == str.charAt(j) && checkPalindrom(str, +1);
	}

	private static boolean checkPalindrom(String str) {
		int i = 0;
		int j = str.length()-1;
		while (i>=j) {
			if (str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return false;

	}
}
