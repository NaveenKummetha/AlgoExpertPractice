package com.algo.graphs;

public class YoungestCommonAncestor {
	public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne,
			AncestralTree descendantTwo) {
		int depth1 = findDepth(topAncestor, descendantOne);
		int depth2 = findDepth(topAncestor, descendantTwo);
		if (depth1 > depth2) {
			AncestralTree ancestralTree = getYoungestOne(descendantOne, descendantTwo, depth1 - depth2);
		} else {
			AncestralTree ancestralTree = getYoungestOne(descendantTwo, descendantOne, depth2 - depth1);
		}

		return topAncestor; // Replace this line
	}

	private static AncestralTree getYoungestOne(AncestralTree lower, AncestralTree higher, int diff) {
		while (diff > 0) {
			diff--;
			lower = lower.ancestor;
		}
		while (lower != higher) {
			lower = lower.ancestor;
			higher = higher.ancestor;
		}
		return lower;
	}

	private static int findDepth(AncestralTree topAncestor, AncestralTree descendant) {
		AncestralTree ancestralTreeVal = descendant;
		int i = 0;
		while (topAncestor != ancestralTreeVal) {
			ancestralTreeVal = ancestralTreeVal.ancestor;
			i++;
		}
		return i;
	}

	static class AncestralTree {
		public char name;
		public AncestralTree ancestor;

		AncestralTree(char name) {
			this.name = name;
			this.ancestor = null;
		}

		// This method is for testing only.
		void addAsAncestor(AncestralTree[] descendants) {
			for (AncestralTree descendant : descendants) {
				descendant.ancestor = this;
			}
		}
	}
}
