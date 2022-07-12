package com.leetcode.DataStructure._14Days._2ndDay;

import java.util.Arrays;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] a = { 0 };
		int[] b = { 0 };
		merge1(a, 0, b, 1);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int p3 = m + n - 1;
		while (p1 >= 0 && p2 >= 0 && p3 >= 0) {
			if (nums1[p1] > nums2[p2]) {
				nums1[p3--] = nums1[p1--];
			} else {
				nums1[p3--] = nums2[p2--];
			}
		}
		while (p1 >= 0)
			nums1[p3--] = nums1[p1--];

		while (p2 >= 0)
			nums1[p3--] = nums2[p2--];

		System.out.println("heloo");

	}

	public static void merge1(int[] nums1, int m, int[] nums2, int n) {
		int ptr1 = m - 1;
		int ptr2 = n - 1; // pointer 1 and pointer 2
		for (int i = nums1.length - 1; i >= 0; i--) {
			if (ptr1 < 0) {
				nums1[i] = nums2[ptr2--];
			} else if (ptr2 < 0) {
				nums1[i] = nums1[ptr1--];
			} else if (nums1[ptr1] > nums2[ptr2]) {
				nums1[i] = nums1[ptr1--];
			} else {
				nums1[i] = nums2[ptr2--];
			}
		}
	}
}
