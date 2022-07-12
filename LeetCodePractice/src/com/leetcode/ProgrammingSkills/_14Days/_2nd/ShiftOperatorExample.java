package com.leetcode.ProgrammingSkills._14Days._2nd;

//Creating ShiftOperatorExample class to perform left, right and unsigned right-shift operations  
public class ShiftOperatorExample {
	// main() method starts
	public static void main(String[] args) {
		// Declaring decimal values
		int x = 40;
		int y = -40;
		int z = 0;

		// Printing positive decimal value in the Binary format
		System.out.println("40  = " + Integer.toBinaryString(x));

		// Performing right shift operation on positive number
		z = x >> 2;

		// Printing result value in Binary format
		System.out.println("40 >> 2  = " + Integer.toBinaryString(z));

		// Performing unsigned right shift operation on positive number
		z = x >>> 2;

		// Printing result value in Binary format
		System.out.println("40 <<< 2 = " + Integer.toBinaryString(z));

		// Printing positive decimal value in the Binary format
		System.out.println("-40 = " + Integer.toBinaryString(y));

		// Performing right shift operation on negative number
		z = y >> 2;

		// Printing result value in Binary format
		System.out.println("-40 <<< 2  = " + Integer.toBinaryString(z));

		// Performing unsigned right shift operation on negative number
		z = y << 2;
		// Printing result value in Binary format
		System.out.println("-40 <<< 2 = " + Integer.toBinaryString(z));
	}
}