package com.leetcode.DataStructure._14Days._7thDay;

public class RemoveLinkedListElements {

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}
		head.next = removeElements(head.next, val);
		if (head.val == val) {
			head = head.next;
		}
		return head;
	}

	public ListNode removeElements1(ListNode head, int val) {
		if (head == null)
			return null;
		head.next = removeElements(head.next, val);
		return head.val == val ? head.next : head;
	}

	public ListNode removeElements2(ListNode head, int val) {
		if (head == null)
			return head;

		ListNode ptr = head;

		while (ptr.next != null) {
			if (ptr.next.val == val)
				ptr.next = ptr.next.next;
			else
				ptr = ptr.next;
		}
		if (head.val == val)
			return head.next;
		return head;
	}
}
