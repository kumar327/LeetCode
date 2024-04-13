package com.aks.Oneto100;

public class RemoveElement_27 {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		// One Way and the best way
//		int index = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != val) {
//				nums[index] = nums[i];
//				index++;
//			}
//		}
//
//		System.out.println("Index IS :: " + index);
//		for (int i = 0; i < index; i++) {
//			System.out.println(nums[index]);
//		}

		/**
		 * Big O -N only but litile complex
		 */
		System.out.println("Second Way");
		int re = nums.length - 1;
		boolean isFound = false;
		if (nums.length > 1) {

			for (int i = 0; i < nums.length && re >= i; i++) {
				if (nums[i] == val) {
					isFound = true;
					while (nums[re] == val && re > i) {
						re--;
					}
					int temp = nums[i];
					nums[i] = nums[re];
					nums[re] = temp;
				}
			}

		} else if (nums.length == 1) {
			if (nums[0] == val) {
				re = 0;
			} else {
				re = 1;
			}
		}

		re = isFound ? re : re + 1;

		System.out.println("RE IS :: " + re);
		for (int i = 0; i < re; i++) {
			System.out.println(nums[i]);
		}
	}
}
