import java.util.Arrays;
import java.util.HashMap;

public class FindPairs {

    public static void findPairs(int[] nums, int givenSum) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        System.out.println("printPairs() input: " + Arrays.toString(nums) + ", and desired sum is : " + givenSum);

        // Sorting the array first
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        boolean found = false;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == givenSum) {
                found = true;
                System.out.printf("Pairs for sum %d id ([%d]-> %d, [%d]->%d). %n", givenSum, left, nums[left], right, nums[right]);
                // System.out.printf("Pairs with sum %d is(%d, %d) %n",
                //         givenSum, nums[left], nums[right]);
                left = left + 1;
            } else if (sum < givenSum) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        if (!found) {
            System.out.printf("No pairs found for sum %d. %n", givenSum);
        }
        System.out.println();
    }

    public static void searchPairs(int[] nums, int target) {
        System.out.println("searchPairs(), input : " + Arrays.toString(nums) + ", sum : " + target);
        HashMap<Integer, Integer> visited = new HashMap<>();
        boolean found = false;

        for (int num: nums) {
            if (visited.get(target - num) != null) {
                System.out.printf("Pair found: (%d, %d) %n", target - num, num);
                found = true;
            } else {
                visited.put(num, target - num);
            }
        }
        if (!found) {
            System.out.println("No pair found for target sum " + target);
        }
    }

    public static void main(String[] args) {
        findPairs(new int[]{1, 2, 3, 4, 5, 6}, 5);
        findPairs(new int[]{0, 5, 7, 9, 11, 2}, 12);
        findPairs(new int[]{1, 2, -3, 4, -5, 6}, 2);
        findPairs(new int[]{1, 0, 1, 4, 2, 6}, 10);
        findPairs(new int[]{11, 21, 31, 41, 51, 61}, 32);
        findPairs(new int[]{1, 2, 3, 4, 5, 6}, 15);

        searchPairs(new int[]{1, 2, 3, 4, 5, 6}, 5);
        searchPairs(new int[]{1, 2, 3, 4, 5, 6}, 5);
        searchPairs(new int[]{0, 5, 7, 9, 11, 2}, 12);
        searchPairs(new int[]{1, 2, -3, 4, -5, 6}, 2);
        searchPairs(new int[]{1, 0, 1, 4, 2, 6}, 10);
        searchPairs(new int[]{11, 21, 31, 41, 51, 61}, 32);
        searchPairs(new int[]{1, 2, 3, 4, 5, 6}, 15);
        searchPairs(new int[]{0, 0, 1, 1, 2, 2}, 3);
    }
}