package com.algo.expert.practice.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TournamentWinners {
	public static void main(String[] args) {
		String[][] competitions = { { "C#", "HTML" }, { "C#", "Python" }, { "HTML", "Python" } };
		int[] results = { 0, 0, 1 };
		System.out.println(solution(competitions, results));
	}

	public static String solution(String[][] competitions, int[] results) {
		Map<String, Integer> val = new HashMap<String, Integer>();
		int max = 0;
		String fteam = null;
		for (int i = 0; i < competitions.length; i++) {
			String team = results[i] == 0 ? competitions[i][0] : competitions[i][1];
			val.put(team, val.getOrDefault(team, 0) + 3);
			if (val.get(team) > max) {
				fteam = team;
				max = val.get(team);
			}
		}
		return fteam;
	}
}
