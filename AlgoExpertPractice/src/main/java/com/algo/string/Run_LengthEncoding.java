package com.algo.string;

public class Run_LengthEncoding {
	public String runLengthEncoding(String string) {
		StringBuilder endodeIt = new StringBuilder();
		int charCount = 1;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == string.charAt(i - 1) || charCount == 9) {
				endodeIt.append(charCount).append(string.charAt(i - 1));
				charCount = 0;
			}
			charCount++;
		}
		endodeIt.append(charCount).append(string.charAt(i - 1));
		// Write your code here.
		return "";
	}
}
