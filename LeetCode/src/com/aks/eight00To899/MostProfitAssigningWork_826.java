package com.aks.eight00To899;

public class MostProfitAssigningWork_826 {

	public static void main(String[] args) {

		int[] difficulty = { 2, 4, 6, 8, 10 };
		int[] profit = { 10, 20, 30, 40, 50 };
		int[] worker = { 4, 5, 6, 7 };
		System.out.println(maxProfitAssignment(difficulty, profit, worker));

	}

	public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
		int re = 0;
		for (int i = 0; i < worker.length; i++) {
			int nextIndex = -1;
			int profit1 = 0;
			for (int j = 0; j < difficulty.length; j++) {
				if (worker[i] < difficulty[j]) {
					continue;
				} else {
					if (profit[j] > profit1) {
						nextIndex = j;
						profit1 = profit[j];

					}
				}
			}
			if (nextIndex >= 0) {
				re += profit[nextIndex];
			}
		}
		return re;
	}
}
