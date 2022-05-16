package com.algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> powerset(List<Integer> array) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(new ArrayList<Integer>());
		for (Integer val : array) {
			int length = list.size();
			for (int i = 0; i < length; i++) {
				List<Integer> subList = new ArrayList<Integer>(list.get(i));
				subList.add(val);
				list.add(subList);
			}
		}
		return list;
	}
}