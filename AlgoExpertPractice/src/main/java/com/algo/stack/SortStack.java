package com.algo.stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class SortStack {

	public ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
		LinkedList aa = new LinkedList<E>();
		aa.p
		if (stack.size() == 0) {
			return stack;
		}
		Integer top = stack.remove(stack.size() - 1);
		sortStack(stack);
		insertInOrder(stack, top);
		return stack;
	}

	private void insertInOrder(ArrayList<Integer> stack, Integer top) {
		if (stack.size() == 0 || stack.get(stack.size() - 1) < top) {
			stack.add(top);
			return;
		}

		Integer topval = stack.remove(stack.size() - 1);

		insertInOrder(stack, topval);

		stack.add(topval);
	}
}
