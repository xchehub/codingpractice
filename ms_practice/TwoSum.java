import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Cannot find answer!");
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2, 7, 11, 5}, 9);
        System.out.println(result.toString());
    }
}