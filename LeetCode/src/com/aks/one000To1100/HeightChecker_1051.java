package com.aks.one000To1100;

import java.util.Arrays;

public class HeightChecker_1051 {

	public static void main(String[] args) {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(heightChecker(heights));
	}

	public static int heightChecker(int[] heights) {

		int[] arr = new int[heights.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = heights[i];
		}

		Arrays.sort(arr);
		int re = 0;
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]+ " :: "+heights[i]);
			if (arr[i] != heights[i]) {
				re++;
			}
		}
		return re;
	}
}
