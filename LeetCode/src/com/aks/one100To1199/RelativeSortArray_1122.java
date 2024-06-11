package com.aks.one100To1199;

import java.util.Arrays;

public class RelativeSortArray_1122 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int[] arr2 = { 2, 1, 4, 3, 9, 6 };
		relativeSortArray(arr1, arr2);
	}

	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] re = new int[arr1.length];
		Arrays.sort(arr1);
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					re[index] = arr2[i];
					index++;
					arr1[j] = -1;
				}
			}
		}
		for (int j = 0; j < arr1.length; j++) {
			if (arr1[j] != -1) {
				re[index] = arr1[j];
				index++;
				arr1[j] = -1;
			}
		}
		return re;
	}
}
