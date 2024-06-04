package com.aks.one800Too1900;

import java.util.List;

public class CircleWinnerGame_1823 {

	public static void main(String[] args) {
		System.out.println(findTheWinner(6, 5));
	}

	public static int findTheWinner(int n, int k) {
		if (n == 1)
			return 1;
		int x = findTheWinner(n - 1, k);
		int y = (x + k - 1) % n + 1;
		return y;

	}

}