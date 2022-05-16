package com.algo.binarytree;

public class FindSuccessor {
	// This is an input class. Do not edit.
	static class BinaryTree {
		public int value;
		public BinaryTree left = null;
		public BinaryTree right = null;
		public BinaryTree parent = null;

		public BinaryTree(int value) {
			this.value = value;
		}
	}

	public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
		if (node.right != null) {
			return findLeftMostChild(node.right);
		}
		return findRightMostParent(node);
	}

	private BinaryTree findRightMostParent(BinaryTree node) {
		BinaryTree val = node;
		while (val.parent != null && val.parent.right == val) {
			val = val.parent;
		}
		return val;
	}

	private BinaryTree findLeftMostChild(BinaryTree node) {
		BinaryTree val = node;
		while (val.left != null) {
			val = val.left;
		}
		return val;
	}
}
