package com.aks.Oneto100;

public class SortColors_75 {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };

		sortColors(arr);

		System.out.println("Results");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void sortColors(int[] nums) {

		int[] arr = new int[3];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
		}
		int index = 0;
		for (int i = 0; i < 3; i++) {
			while (arr[i] > 0) {
				nums[index] = i;
				arr[i]--;
				index++;
			}
		}
	}

}
