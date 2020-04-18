package com.java.tutorial.arrayfunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayIndexesForTargetSum {
	public static void main(String[] args) {
		int target =7;
		int[] twoSumArray = {2,3,7,4,8}; 
		Map<Integer, Integer> deltaMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < twoSumArray.length; i++) {
			int j = twoSumArray[i];
			int delta = target - j;
			if(deltaMap.containsKey(delta)) {
				System.out.println(Arrays.toString(new int[]{deltaMap.get(delta),i}));
				break;
			}
			deltaMap.put(twoSumArray[i], i);
			
		}
		System.out.println(Arrays.toString(new int[]{-1,-1}));
	}

}
