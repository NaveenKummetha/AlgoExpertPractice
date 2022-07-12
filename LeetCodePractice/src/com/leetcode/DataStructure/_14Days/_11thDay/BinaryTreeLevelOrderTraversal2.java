package com.leetcode.DataStructure._14Days._11thDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.left.left = new TreeNode(19);
		root.right.right = new TreeNode(25);
		System.out.println(Arrays.asList(new BinaryTreeLevelOrderTraversal2().levelOrder(root)));
		;
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return null;
		}
		Queue<TreeNode> val = new LinkedList<TreeNode>();
		val.add(root);
		while (!val.isEmpty()) {
			List<Integer> orde = new ArrayList<Integer>();
			int siz = val.size();
			for (int i = 0; i < siz; i++) {
				TreeNode val1 = val.poll();
				orde.add(val1.val);
				if (val1.left != null) {
					val.add(val1.left);
				}
				if (val1.right != null) {
					val.add(val1.right);
				}
			}
			res.add(orde);
		}
		return res;

	}

	public List<List<Integer>> levelOrder_1(TreeNode root) {
		List<List<Integer>> all = new LinkedList<List<Integer>>();
		if (root == null) {
			return null;
		}
		levelHelper(all, root, 0);
		return all;
	}

	private void levelHelper(List<List<Integer>> all, TreeNode root, int levl) {
		if (root == null) {
			return;
		}
		List<Integer> aa = null;
		if (levl >= all.size()) {
			aa = new ArrayList<Integer>();
			aa.add(root.val);
			all.add(aa);
		} else {
			aa = all.get(levl);
			aa.add(root.val);
		}
		levelHelper(all, root.left, levl + 1);
		levelHelper(all, root.right, levl + 1);
	}

}
