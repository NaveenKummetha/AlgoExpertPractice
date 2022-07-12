package com.leetcode.DataStructure._14Days._10thDay;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> aa = new ArrayList();
		if (root == null) {
			return aa;
		}
		aa.add(root.val);
		aa.addAll(preorderTraversal(root.left));
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
