package com.leetcode.ProgrammingSkills._14Days._1st;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
	public static void main(String[] args) {
		int[] hh = { 4000, 3000, 1000, 2000 };
		System.out.println(average(hh));
	}

	public static double average(int[] salary) {
		int min = salary[0], max = salary[0];
		double sum = salary[0];
		for (int i = 1; i < salary.length; i++) {
			sum += salary[i];
			if (min > salary[i]) {
				min = salary[i];
			} else if (max < salary[i]) {
				max = salary[i];
			}
		}
		return (sum - min - max) / (salary.length - 2);
	}

	private double average2(int[] salary) {
		double sum = 0.0;
		double n = salary.length - 2;
		double min = salary[0] + 0.0, max = salary[0] + 0.0;

		for (int i : salary) {

			min = Math.min(min, i);
			max = Math.max(max, i);
			sum += i;

		}

		return (sum - min - max) / n;
	}
}
