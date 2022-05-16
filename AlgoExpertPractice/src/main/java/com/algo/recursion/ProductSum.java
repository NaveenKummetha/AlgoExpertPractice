package com.algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
	 public static int productSum(List<Object> array) {
			return productSumSub(array, 1);
		}

		private static int productSumSub(List<Object> array, int multiplier) {
			int sum = 0;
			for (Object object : array) {
				if (object instanceof ArrayList) {
					sum += productSumSub((ArrayList<Object>)object, multiplier + 1);
				} else {
					sum += (int) object;
				}
			}
			sum += sum * multiplier;
			return sum;
		}
	}
