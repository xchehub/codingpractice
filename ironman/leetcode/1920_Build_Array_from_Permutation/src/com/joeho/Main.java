package com.joeho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given a zero-based permutation nums (0-indexed),
* build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
* A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
*
*/
public class Main {
    public static int[] buildArray(int[] nums) {
        List<Integer> out = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            out.add(nums[nums[i]]);
        }

        // int[] result = new int[out.size()];
        // for (int i: out) {
        //     result[i] = out.get(i);
        // }
        // return result;
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{0,2,1,5,3,4};
        System.out.println("1. ["+ Arrays.toString(nums) + "]: " + Arrays.toString(buildArray(nums)));
        nums = new int[]{5,0,1,2,3,4};
        System.out.println("2. ["+ Arrays.toString(nums) + "]: " + Arrays.toString(buildArray(nums)));
    }
}
