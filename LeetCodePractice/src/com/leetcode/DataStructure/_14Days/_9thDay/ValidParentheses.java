package com.leetcode.DataStructure._14Days._9thDay;

import java.util.Stack;

public class ValidParentheses {
	// Fast
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public boolean isValid1(String s) {
		Stack<Character> stack = new Stack<Character>();
		// Iterate through string until empty
		for (int i = 0; i < s.length(); i++) {
			// Push any open parentheses onto stack
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			// Check stack for corresponding closing parentheses, false if not valid
			else if (s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
				stack.pop();
			else if (s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
				stack.pop();
			else if (s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
				stack.pop();
			else
				return false;
		}
		// return true if no open parentheses left in stack
		return stack.empty();
	}

	public boolean isValid2(String s) {
		char[] stack = new char[s.length()];
		int head = 0;
		for (char c : s.toCharArray()) {
			switch (c) {
			case '{', '[', '(':
				stack[head++] = c;
				break;
			case '}':
				if (head == 0 || stack[--head] != '{')
					return false;
				break;
			case ')':
				if (head == 0 || stack[--head] != '(')
					return false;
				break;
			case ']':
				if (head == 0 || stack[--head] != '[')
					return false;
				break;
			}
		}
		return head == 0;

	}
}
