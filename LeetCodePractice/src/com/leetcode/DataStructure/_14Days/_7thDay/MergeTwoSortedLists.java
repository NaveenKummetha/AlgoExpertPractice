package com.leetcode.DataStructure._14Days._7thDay;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		ListNode preHead = new ListNode(0);
		ListNode last = preHead;

		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				last.next = l2;
				l2 = l2.next;
			} else {
				last.next = l1;
				l1 = l1.next;
			}
			last = last.next;
		}

		if (l1 == null) {
			last.next = l2;
		} else {
			last.next = l1;
		}

		return preHead.next;
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head = null;
		ListNode fin = null;
		if (list1.val >= list2.val) {
			fin.next = list1;
			list1 = list1.next;
		} else {
			fin.next = list2;
			list2 = list2.next;
		}
		head = fin;
		while (list1 != null || list2 != null) {
			if (list1.val >= list2.val) {
				fin.next = list1;
				list1 = list1.next;
			} else {
				fin.next = list2;
				list2 = list2.next;
			}
		}
		if (list1 != null) {
			fin.next = list1;
		}
		if (list2 != null) {
			fin.next = list2;
		}
		return head;

	}

}
