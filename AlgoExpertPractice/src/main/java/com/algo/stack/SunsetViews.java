package com.algo.stack;

import java.util.ArrayList;
import java.util.Collections;

public class SunsetViews {

	public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
		int start = buildings.length - 1;
		int step = -1;
		ArrayList<Integer> aa = new ArrayList<Integer>();
		if (direction.equals("WEST")) {
			start = 0;
			step = 1;
		}
		int id = start;
		int startHieght = 0;
		while (id >= 0 && id < buildings.length) {
			int buildingHieght = buildings[id];
			if (buildingHieght > startHieght) {
				aa.add(buildingHieght);
			}
			startHieght = Math.max(startHieght, buildingHieght);
			id += step;
		}
		Collections.sort(aa);
		return aa;
	}
}
