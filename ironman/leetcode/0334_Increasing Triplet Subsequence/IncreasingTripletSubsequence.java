public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length <= 2) {
            return false;
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr > min2) {
                return true;
            } else if (curr < min1) {
                min1 = curr;
            } else if (curr > min1 && curr < min2) {
                min2 = curr;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] input = {20, 100, 10, 12, 5, 13};
        System.out.println(increasingTriplet(input));

        int[] input2 = {2,4,-2,-3};
        System.out.println(increasingTriplet(input2));

        int[] input3 = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTriplet(input3));
    }
}
