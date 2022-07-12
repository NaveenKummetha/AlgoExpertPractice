package com.leetcode.ProgrammingSkills._14Days._2nd;

public class SubtracttheProductandSumofDigitsofanInteger {
	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));
	}

	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int prod = 1;
		while (n > 0) {
			prod *= n % 10;
			sum += n % 10;
			n /= 10;
		}
		System.out.println(prod + " " + sum);
		return prod - sum;
	}
}