package com.leetcode.DataStructure._14Days._10thDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

	public List<Integer> preorderTraversal_iterative(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			result.add(node.val);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}
		return result;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> aa = new ArrayList();
		if (root == null) {
			return aa;
		}

		aa.addAll(preorderTraversal(root.left));
		aa.add(root.val);
		aa.addAll(preorderTraversal(root.right));
		return aa;

	}

	public List<Integer> withHelper(TreeNode root) {
		List<Integer> aa = new ArrayList();
		addTreePree(root, aa);
		return aa;
	}

	private void addTreePree(TreeNode root, List<Integer> aa) {
		if (root == null) {
			return;
		}
		aa.add(root.val);
		addTreePree(root.left, aa);
		addTreePree(root.right, aa);
	}

}
