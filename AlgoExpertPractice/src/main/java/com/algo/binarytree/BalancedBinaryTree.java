package com.algo.binarytree;

public class BalancedBinaryTree {
	// This is an input class. Do not edit.
	static class BinaryTree {
		public int value;
		public BinaryTree left = null;
		public BinaryTree right = null;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

	boolean val = true;

	public boolean heightBalancedBinaryTree(BinaryTree tree) {
		isTreeBalanced(tree);
		return val;
	}

	private int isTreeBalanced(BinaryTree tree) {
		if (tree == null) {
			return 0;
		}
		int leftVal = isTreeBalanced(tree.left);
		int rightTreeVal = isTreeBalanced(tree.right);
		System.out.println("I am :" + tree.value);
		if ((Math.abs(leftVal - rightTreeVal) > 1)) {
			System.out.println("I am Coming:" + tree.value);
			val = false;
			return 0;
		}
		return Math.max(leftVal, rightTreeVal) + 1;
	}
}
