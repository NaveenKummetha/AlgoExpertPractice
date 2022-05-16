package com.algo.bst;

import java.util.ArrayList;
import java.util.List;

public class BSTTraversal {
	public static List<Integer> inOrderTraverse(BST tree, List<Integer> array) {
		inOrder(tree, array);
		return array;
	}

	private static void inOrder(BST tree, List<Integer> array) {
		if (tree == null) {
			return;
		}
		if (tree.left != null) {
			inOrder(tree.left, array);
		}
		array.add(tree.value);
		if (tree.right != null) {
			inOrder(tree.right, array);
		}
	}

	public static List<Integer> preOrderTraverse(BST tree, List<Integer> array) {
		preOrder(tree, array);
		return array;
	}

	private static void preOrder(BST tree, List<Integer> array) {
		if (tree == null) {
			return;
		}
		array.add(tree.value);
		if (tree.left != null) {
			preOrder(tree.left, array);
		}

		if (tree.right != null) {
			preOrder(tree.right, array);
		}
	}

	public static List<Integer> postOrderTraverse(BST tree, List<Integer> array) {
		postOrder(tree, array);
		return array;
	}

	private static void postOrder(BST tree, List<Integer> array) {
		if (tree == null) {
			return;
		}

		if (tree.left != null) {
			postOrder(tree.left, array);
		}

		if (tree.right != null) {
			postOrder(tree.right, array);
		}
		array.add(tree.value);
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
