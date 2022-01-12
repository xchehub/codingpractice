package com.joeho;

public class Main {

    public static int searchInsert(int[] nums, int target) {
        int lo = 0;
        int up = nums.length -1;
        int mid = 0;

        while (lo <= up) {
            mid = (lo + up ) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                up = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

        int[] nums2 = {1,3,5,6};
        int target2 = 2;
        System.out.println(searchInsert(nums2, target2));

        int[] nums3 = {1,3,5,6};
        int target3 = 7;
        System.out.println(searchInsert(nums3, target3));
    }
}
