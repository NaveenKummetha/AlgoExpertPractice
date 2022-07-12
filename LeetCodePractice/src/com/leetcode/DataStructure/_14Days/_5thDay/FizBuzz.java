package com.leetcode.DataStructure._14Days._5thDay;

import java.util.stream.IntStream;

public class FizBuzz {
//	public static void main(String[] args) {
//		System.out.println(printFizzBuzz(15));
//	}

	public static String printFizzBuzz(int n) {
		StringBuffer val = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			boolean divisibleBy3 = i % 3 == 0;
			boolean divisibleBy5 = i % 5 == 0;
			if (divisibleBy3 && divisibleBy5) {
				val.append("FizzBuzz");
			} else if (divisibleBy3) {
				val.append("Fizz");
			} else if (divisibleBy5) {
				val.append("Buzz");
			} else {
				val.append(i);
			}
			val.append(",");
		}
		return val.toString().substring(0, val.length() - 1);
	}

	public static void main(String args[]) {
		int n = 100;

		// loop for 100 times
		for (int i = 1; i <= n; i++) {
			// number divisible by 15(divisible by
			// both 3 & 5), print 'FizzBuzz' in
			// place of the number
			if (i % 15 == 0)
				System.out.print("FizzBuzz" + " ");
			// number divisible by 5, print 'Buzz'
			// in place of the number
			else if (i % 5 == 0)
				System.out.print("Buzz" + " ");

			// number divisible by 3, print 'Fizz'
			// in place of the number
			else if (i % 3 == 0)
				System.out.print("Fizz" + " ");

			else // print the numbers
				System.out.print(i + " ");
		}
	}

}
