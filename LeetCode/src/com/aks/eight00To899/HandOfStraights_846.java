package com.aks.eight00To899;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandOfStraights_846 {

	public static void main(String[] args) {

		int[] hand = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
		int groupSize = 3;
		System.out.println(isNStraightHand(hand, groupSize));
	}

	public static boolean isNStraightHand(int[] hand, int groupSize) {
		int l = hand.length;
		if (l % groupSize != 0)
			return false;

		Arrays.sort(hand);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < l; i++) {
			list.add(hand[i]);
		}

		while (list.size() > 0) {
			int count = 1;
			int index = 0;
			int start = list.get(0);
			list.remove(0);
			while (count < groupSize) {
				if (index >= list.size())
					return false;
				if (start == list.get(index)) {
					index++;
				} else if ((start + 1) == list.get(index)) {
					count++;
					start = list.get(index);
					list.remove(index);
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
