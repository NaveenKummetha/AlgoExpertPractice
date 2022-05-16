package com.algo.bst;

public class FindKth {
	// This is an input class. Do not edit.
	static class BST {
		public int value;
		public BST left = null;
		public BST right = null;

		public BST(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		FindKth.BST root = new FindKth.BST(15);
		root.left = new FindKth.BST(5);
		root.left.left = new FindKth.BST(2);
		root.left.left.left = new FindKth.BST(1);
		root.left.left.right = new FindKth.BST(3);
		root.left.right = new FindKth.BST(5);
		root.right = new FindKth.BST(20);
		root.right.left = new FindKth.BST(17);
		root.right.right = new FindKth.BST(22);
		int k = 3;
		findKthLargestValueInBst(root, k);
	}

	public static int findKthLargestValueInBst(BST tree, int k) {
		findIt(tree, k);
		return prev;
	}

	static int prev;
	static int current;

	public static void findIt(BST tree, int k) {
		if (k == current) {
			return;
		}
		if (tree.right != null) {
			findIt(tree.right, k);
		}
		current++;
		if (k == current) {
			prev = tree.value;
			return;
		}

		if (tree.left != null) {
			findIt(tree.left, k);
		}
	}
}
