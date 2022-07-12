package com.hello;

import java.util.Arrays;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i = 0;
		for (String string : operations) {
			if (string.charAt(1)=='+') 
				i++;
			else
				i--;
		}
        return i;
    }
}

class Solution2 {
    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations,0,operations.length)
            .mapToInt(operation->operation.charAt(1)=='+'?1:-1)
            .sum();
    }
}