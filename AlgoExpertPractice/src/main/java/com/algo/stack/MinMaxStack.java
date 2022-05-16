package com.algo.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;


class Program {
  // Feel free to add new properties and methods to the class.
  static class MinMaxStack {
		List<Integer> list_1 = new ArrayList<Integer>();
		List<Map<String, Integer>> list_2 = new ArrayList<Map<String, Integer>>();

	// Feel free to add new properties and methods to the class.

	public int peek() {
		return list_1.get(list_1.size() - 1);
	}

	public int pop() {
		System.out.println(Arrays.asList(list_1));
		list_2.remove(list_2.size() - 1);
		return list_1.remove(list_1.size() - 1);
	}

	public void push(int number) {
		list_1.add(number);
		Map<String, Integer> local = new HashMap<String, Integer>();
		local.put("min", number);
		local.put("max", number);
		if (list_2.size() > 0) {
			Map<String, Integer> last = list_2.get(list_2.size() - 1);
			local.put("min", Integer.min(last.get("min"), number));
			local.put("max", Integer.max(last.get("max"), number));
		}
		list_2.add(local);
		list_1.add(number);
	}

	public int getMin() {
		return list_2.get(list_2.size() - 1).get("min");
	}

	public int getMax() {
		return list_2.get(list_2.size() - 1).get("max");
	}
}
}
