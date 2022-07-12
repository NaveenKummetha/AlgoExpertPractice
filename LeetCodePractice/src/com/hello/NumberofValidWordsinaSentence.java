package com.hello;

public class NumberofValidWordsinaSentence {
	public static void main(String[] args) {

		int number = 374;
		int count = 0;
		while (number > 0) {
			int remainder = number % 10;
			if (isPrimeNumber(remainder)) {
				count += remainder;
			}
			number = number / 10;

		}
		System.out.println(count);
	}

	public static boolean isPrimeNumber(int val) {
		int i, m = 0;
		boolean flag = true;
		m = val / 2;
		if (val == 0 || val == 1) {
			flag = false;
		} else {
			for (i = 2; i <= m; i++) {
				if (val % i == 0) {
					flag = false;
					break;
				}
			}
		} // end of else
		return flag;
	}

}
