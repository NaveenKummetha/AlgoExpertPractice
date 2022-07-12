package com.leetcode.DataStructure._14Days._8thDay;

public class RemoveDuplicatesfromSortedList {
	// Fastest
	public ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}

		}
		return head;

	}

	public ListNode deleteDuplicates1(ListNode head) {
		if (head == null || head.next == null)
			return head;
		head.next = deleteDuplicates(head.next);
		return head.val == head.next.val ? head.next : head;
	}

	public ListNode deleteDuplicates3(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head;
		ListNode curr = p.next;
		while (curr != null) {
			if (curr.val != p.val) {
				p.next = curr;
				p = curr;
			}
			curr = curr.next;
		}
		p.next = curr;
		return head;
	}
	public ListNode deleteDuplicates4(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			ListNode temp = curr.next;
			while (temp != null && temp.val == curr.val) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
		return head;
	}
}
