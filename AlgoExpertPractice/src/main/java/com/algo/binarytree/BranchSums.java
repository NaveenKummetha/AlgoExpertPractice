package com.algo.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
	// This is the class of the input root. Do not edit it.
	public static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public static List<Integer> branchSums(BinaryTree root) {
		List<Integer> val = new ArrayList<Integer>();
		sumIt(root, val, 0);
		return val;
	}

	private static void sumIt(BinaryTree root, List<Integer> val, int sum) {
		if (root == null) {
			return;
		}

		sum += root.value;
		if (root.left == null && root.right == null) {
			val.add(sum);
		}
		sumIt(root.left, val, sum);
		sumIt(root.right, val, sum);
	}
}
