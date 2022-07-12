package com.leetcode.DataStructure._14Days._10thDay;

import java.util.ArrayList;
import java.util.List;



public class BinaryTreePostorderTraversal {

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
