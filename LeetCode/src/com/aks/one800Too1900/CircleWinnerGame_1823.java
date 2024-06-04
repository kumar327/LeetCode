package com.aks.one800Too1900;

import java.util.ArrayList;
import java.util.List;

public class CircleWinnerGame_1823 {

	public static void main(String[] args) {
		findTheWinner(6, 5);
	}

	public static int findTheWinner(int n, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		return wineer(list, k, 0);

	}

	public static int wineer(List<Integer> list, int k, int start) {
		if (list.size() <= 1)
			return list.get(0);

		int count = 1;
		while (k > count) {
			if ((start + 1) >= list.size()) {
				start = 0;
			} else {
				start++;
			}

			count++;
		}
		System.out.println(list);
		System.out.println(start);
		list.remove(start);
		return wineer(list, k, start);
	}

}