package com.aks.nine00To999;

import java.util.Arrays;

public class MinimumIncrementArrayUnique_945 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 2, 1, 7 };
		System.out.println(minIncrementForUnique(nums));
	}

	public static int minIncrementForUnique(int[] nums) {

		Arrays.sort(nums);
		int re = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int val = nums[i];
			int nextValue = val + 1;
			for (int j = i + 1; j < nums.length; j++) {
				if (val == nums[j]) {
					nums[j] = nextValue;
					re++;
				} else {
					break;
				}
			}
		}

		return re;
	}
}
