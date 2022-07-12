package com.leetcode.DataStructure._14Days._11thDay;

import java.util.Arrays;

public class MaximumDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.left.left = new TreeNode(19);
		root.right.right = new TreeNode(25);
		System.out.println(Arrays.asList(new MaximumDepthofBinaryTree().maxDepth(root)));
	}

	public int maxDepth(TreeNode root) {

		// Base Condition
		if (root == null)
			return 0;
		// Hypothesis
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		// Induction
		return Math.max(left, right) + 1;

	}

	public int maxDepth1(TreeNode root) {
		if (root == null)
			return 0;
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
