package com.leetcode.DataStructure._14Days._11thDay;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		} else if (root.right == null && root.left == null) {
			return true;
		} else {
			return isSymmetricUtil(root.left, root.right);
		}
	}

	public boolean isSymmetricUtil(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		} else if (p.val != q.val) {
			return false;
		} else {
			return (isSymmetricUtil(p.left, q.right) && isSymmetricUtil(p.right, q.left));
		}
	}
}
