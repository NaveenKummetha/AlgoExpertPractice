package com.leetcode.DataStructure._14Days._3rdDay;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));
	}

	public static int maxProfit1(int[] prices) {
		int minPrice = prices[0];
		int maxProfit = 0;
		for (int price : prices) {
			minPrice = Math.min(minPrice, price);
			maxProfit = Math.max(maxProfit, price - minPrice);
		}
		return maxProfit;
	}

	public static int maxProfit(int[] prices) {
		int lsf = Integer.MAX_VALUE;
		int op = 0;
		int pist = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < lsf)
				lsf = prices[i];

			pist = prices[i] - lsf;
			if (op < pist) {
				op = pist;
			}
		}
		return op;
	}
}
