package com.algo.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTreeUsingQue {
	public static void invertBinaryTree(BinaryTree val) {
		Queue<BinaryTree> que = new LinkedList<BinaryTree>();
		que.add(val);
		while (!que.isEmpty()) {
			BinaryTree tree = que.poll();
			if (tree == null) {
				continue;
			}
			swap(tree);
			que.add(tree.left);
			que.add(tree.right);
		}

	}

	private static void swap(BinaryTree tree) {
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
