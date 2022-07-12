package com.leetcode.DataStructure._14Days._7thDay;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class LinkedList {
	public boolean hasCycle(ListNode head) {
		ListNode st = head, ft = head;
		while (st != null && ft != null) {
			st = st.next;
			ft = ft.next.next;
			if (st == ft) {
				return true;
			}
		}

		return false;

	}

	public boolean hasCycle1(ListNode head) {
		if (head == null || head.next == null)
			return false;
		if (head.next == head)
			return true;
		ListNode nextNode = head.next;
		head.next = head;
		boolean isCycle = hasCycle(nextNode);
		return isCycle;
	}

}
