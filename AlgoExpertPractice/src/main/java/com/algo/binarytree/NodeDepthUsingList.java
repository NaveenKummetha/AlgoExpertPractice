package com.algo.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class NodeDepthUsingList {

	public static int nodeDepths(BinaryTree root) {
		Queue<Level> que = new LinkedList<Level>();
		que.add(new Level(root, 0));
		int sum = 0;
		while (!que.isEmpty()) {
			Level tree = que.poll();
			if (tree.binaryTree == null) {
				continue;
			}
			sum += tree.level;

			que.add(new Level(tree.binaryTree.left, tree.level + 1));
			que.add(new Level(tree.binaryTree.right, tree.level + 1));
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
