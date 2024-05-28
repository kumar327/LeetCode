package com.aks.two500To2599;

public class DiffBtEleSumAndDigitSum_2535 {

	public static void main(String[] args) {
		int[] arr = { 1, 15, 6, 3 };
		int re = differenceOfSum(arr);
		System.out.println(re);
	}

	public static int differenceOfSum(int[] nums) {
		int eleSum = 0;
		int digSum = 0;
		for (int i = 0; i < nums.length; i++) {
			eleSum += nums[i];
			if (nums[i] > 9) {
				int temp = nums[i];
				while (temp > 0) {
					digSum += temp % 10;
					temp = temp / 10;
				}
			} else {
				digSum += nums[i];
			}
		}

		return Math.abs(eleSum - digSum);
	}
}
