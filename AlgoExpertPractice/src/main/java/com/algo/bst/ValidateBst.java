package com.algo.bst;

import java.util.*;

public class ValidateBst {
	// O(n) time | O(d) space
	public static void main(String[] args) {
		var root = new ValidateBst.BST(10);
		root.left = new ValidateBst.BST(5);
		root.left.left = new ValidateBst.BST(2);
		root.left.left.left = new ValidateBst.BST(1);
		root.left.right = new ValidateBst.BST(5);
		root.left.right.right = new ValidateBst.BST(11);
		root.right = new ValidateBst.BST(15);
		root.right.left = new ValidateBst.BST(13);
		root.right.left.right = new ValidateBst.BST(14);
		root.right.right = new ValidateBst.BST(22);
		System.out.println(validateBst(root));
	}

	public static boolean validateBst(BST tree) {
		return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validateBst(BST tree, int minValue, int maxValue) {
		if (tree.value < minValue || tree.value > maxValue) {
			return false;
		}
		if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
			return false;
		}
        return tree.right == null || validateBst(tree.right, tree.value, maxValue);
    }

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}
	}
}