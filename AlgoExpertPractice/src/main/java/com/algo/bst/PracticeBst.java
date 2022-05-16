package com.algo.bst;

import java.util.*;

import com.algo.bst.Program123.BST;

public class PracticeBst {
	public static void main(String[] args) {
		var root = new PracticeBst.BST(10);
		root.left = new PracticeBst.BST(5);
		root.left.left = new PracticeBst.BST(2);
		root.left.left.left = new PracticeBst.BST(1);
		root.left.right = new PracticeBst.BST(5);
		root.right = new PracticeBst.BST(15);
		root.right.left = new PracticeBst.BST(13);
		root.right.left.right = new PracticeBst.BST(14);
		root.right.right = new PracticeBst.BST(22);

//		root.insert(12);

		BST bss = root.remove(13);
		System.out.println(bss);
	}

	static class BST {
		public int value;
		public BST left;
		public BST right;

		public BST(int value) {
			this.value = value;
		}

// Average: O(log(n)) time | O(log(n)) space
// Worst: O(n) time | O(n) space
		public BST insert(int value) {
			if (value < this.value) {
				if (left == null) {
					BST newBST = new BST(value);
					left = newBST;
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					BST newBST = new BST(value);
					right = newBST;
				} else {
					right.insert(value);
				}
			}
			return this;
		}

// Average: O(log(n)) time | O(log(n)) space
// Worst: O(n) time | O(n) space
		public boolean contains(int value) {
			if (value < this.value) {
				if (left == null) {
					return false;
				} else {
					return left.contains(value);
				}
			} else if (value > this.value) {
				if (right == null) {
					return false;
				} else {
					return right.contains(value);
				}
			} else {
				return true;
			}
		}

// Average: O(log(n)) time | O(log(n)) space
// Worst: O(n) time | O(n) space
		public BST remove(int value) {
			remove(value, null);
			return this;
		}

		public void remove(int value, BST parent) {
			if (value < this.value) {
				if (left != null) {
					left.remove(value, this);
				}
			} else if (value > this.value) {
				if (right != null) {
					right.remove(value, this);
				}
			} else {
				if (left != null && right != null) {
					this.value = right.getMinValue();
					right.remove(this.value, this);
				} else if (left != null) {
					this.value = left.value;
					this.right = null;
					this.left=null;
				} else if (right != null) {
					this.value = right.value;
					this.right = null;
					this.left=null;
				}
			}
		}

		public int getMinValue() {
			if (left == null) {
				return this.value;
			} else {
				return left.getMinValue();
			}
		}
	}
}
