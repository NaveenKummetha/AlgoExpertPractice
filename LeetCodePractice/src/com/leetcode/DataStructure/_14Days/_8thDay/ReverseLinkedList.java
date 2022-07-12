package com.leetcode.DataStructure._14Days._8thDay;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class ReverseLinkedList {
	//Top solution
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode n = head.next;
			head.next = prev;
			prev = head;
			head = n;
		}
		return prev;
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;
		ListNode next = head.next;
		head.next = newHead;
		return reverseListInt(next, head);
	}
	//Using 
	public ListNode reverseList1(ListNode head) {
	    ListNode curr = null;
	    ListNode temp = head;
	    ListNode prev = null;
	    while(temp != null){
	        prev = curr;
	        curr = temp;
	        temp = curr.next;
	        curr.next = prev;
	    }
	    return curr; 
	}

}
