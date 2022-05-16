package com.algo.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeDepth {

	public static int nodeDepths(BinaryTree root) {
		int count = findDepth(root, 0);
		return -1;
	}

	private static int findDepth(BinaryTree root, int i) {
		if (root == null) {
			return 0;
		}
		int left = findDepth(root.left, i + 1);
		int right = findDepth(root.right, i + 1);
		return i + left + right;
	}

	private static int findDepthUsingQue(BinaryTree root) {
		Stack<Level> que = new Stack<NodeDepth.Level>();
		que.add(new Level(root, 0));
		int sum = 0;
		while (!que.isEmpty()) {
			Level tree = que.pop();
			if (tree.binaryTree == null) {
				continue;
			}
			sum += tree.level;

			que.add(new Level(root.left, sum + 1));
			que.add(new Level(root.right, sum + 1));
		}
		return sum;
	}

	static class Level {
		BinaryTree binaryTree;
		int level;

		public Level(BinaryTree binaryTree, int level) {
			super();
			this.binaryTree = binaryTree;
			this.level = level;
		}

	}

	static class BinaryTree {
		int value;
		BinaryTree left;
		BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}
}
