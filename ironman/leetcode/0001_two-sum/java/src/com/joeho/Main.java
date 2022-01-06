package com.joeho;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Question:
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class Main {

    public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[] {map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No Answer");
    }

    public static void main(String[] args) {
	// write your code here
        int[] nums = {2, 7, 11, 15};
        int target  = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
