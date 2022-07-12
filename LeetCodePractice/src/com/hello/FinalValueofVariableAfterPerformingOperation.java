package com.hello;

public class FinalValueofVariableAfterPerformingOperation {
	public int finalValueAfterOperations(String[] operations) {
		int i = 0;
		for (String string : operations) {
			if (string.charAt(1) == '+')
				i++;
			else
				i--;
		}
		return i;
	}
}
