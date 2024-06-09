package com.aks.nine00To999;

import java.util.HashMap;

public class SubarraySumsDivisibleByK_974 {

	public static void main(String[] args) {
		int[] nums = { 4, 5, 0, -2, -3, 1 };
		int k = 5;
		System.out.println(subarraysDivByK(nums, k));
	}

	public static int subarraysDivByK(int[] nums, int k) {
		// int re=0;
		// for(int i=0;i<nums.length;i++){
		// int sum=0;
		// for(int j=i;j<nums.length;j++){
		// sum+=nums[j];
		// if(sum%k==0){
		// re++;
		// }
		// }
		// }
		// return re;

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		int rem = 0;
		int re = 0;
		for (int i = 0; i < nums.length; i++) {
			rem = (rem + nums[i]) % k;
			if (rem < 0) {
				rem += k;
			}

			re += map.getOrDefault(rem, 0);
			map.put(rem, map.getOrDefault(rem, 0) + 1);
		}
		return re;
	}
}
