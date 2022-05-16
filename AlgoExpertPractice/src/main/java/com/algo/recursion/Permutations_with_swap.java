package com.algo.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_with_swap {
	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3 };
		getPermutations(Arrays.asList(arr));

	}

	// O(n*n!) time | O(n*n!) space
	public static List<List<Integer>> getPermutations(List<Integer> array) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		getPermutations(0, array, permutations);
		return permutations;
	}

	public static void getPermutations(int cid, List<Integer> array, List<List<Integer>> permutations) {
		if (cid == array.size() - 1) {
			permutations.add(new ArrayList<Integer>(array));
		} else {
			for (int j = cid; j < array.size(); j++) {
				swap(array, cid, j);
				getPermutations(cid + 1, array, permutations);
				swap(array, cid, j);
			}
		}
	}

	public static void swap(List<Integer> array, int i, int j) {
		Integer tmp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, tmp);
	}

}