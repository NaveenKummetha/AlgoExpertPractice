package com;

//import for Scanner and other utility classes
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestBinary {
	public static void main(String args[]) throws Exception {
		System.out.println("Type");
		Scanner s = new Scanner(System.in);
		int noOf = Integer.valueOf(s.nextLine());
		List<Integer> valArr = new ArrayList(noOf);
		for (int i = 0; i < noOf; i++) {
			valArr.add(Integer.valueOf(s.nextLine()));
		}
		int val = 1;
		for (int i = 1; i <= valArr.get(valArr.size() - 1);) {
			String bin = Integer.toBinaryString(val++);
			if (!bin.contains("11")) {
				i++;
			}
			if (valArr.contains(i-1)) {
				System.out.println(bin);
			}
		}
	}
}
