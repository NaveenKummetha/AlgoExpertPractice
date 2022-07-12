package com.leetcode.DataStructure._14Days._4thDay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
	public static void main(String[] args) {
		new PascalsTriangle().generate_1(5);
	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> top = new LinkedList<List<Integer>>();
		List<Integer> aa = new ArrayList<Integer>();
		aa.add(1);
		top.add(aa);
		int val = 0;
		printPascal(numRows - 1, val, top);
		return top;

	}

	private List<List<Integer>> printPascal(int numRows, int val, List<List<Integer>> top) {
		if (numRows > val) {
			List<Integer> last = top.get(val);
			List<Integer> aa = new LinkedList<Integer>();
			aa.add(last.get(0));
			int i = 0;
			for (; i < last.size() - 1; i++) {
				aa.add(last.get(i) + last.get(i + 1));
			}
			aa.add(last.get(i));
			top.add(aa);
			val++;
			return printPascal(numRows, val, top);
		}
		return top;

	}

	public List<List<Integer>> generate_1(int numRows) {
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();

		ArrayList<Integer> r1 = new ArrayList<Integer>();
		r1.add(1);
		allrows.add(r1);

		for (int i = 0; i < numRows - 1; i++) {
			List<Integer> ro = allrows.get(i);
			ArrayList<Integer> row = new ArrayList<Integer>();
			int j = 0;
			row.add(1);
			for (; j < ro.size() - 1; j++)
				row.add(ro.get(j) + ro.get(j + 1));
			row.add(1);
			allrows.add(row);
		}
		return allrows;

	}

	public List<List<Integer>> generate_2(int numRows) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		List<Integer> pre = new ArrayList<>();
		List<Integer> row = null;

		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}
			}

			pre = row;
			list.add(row);
		}
		return list;
	}

}
