package com.algo.binarytree;

public class InvertBinaryTree {
	public static void invertBinaryTree(BinaryTree tree) {
		if (tree == null) {
			return;
		}
		swapLeftAndRight(tree);
		invertBinaryTree(tree.left);
		invertBinaryTree(tree.right);
	}

	private static void swapLeftAndRight(BinaryTree tree) {
		BinaryTree left = tree.left;
		tree.left = tree.right;
		tree.right = left;
	}

	static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
		}
	}
}
