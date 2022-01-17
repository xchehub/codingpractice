package com.joeho;

import java.util.Arrays;
import java.util.List;

public class Main {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    private static void minMaxSum(List<Integer> arr) {
        // Write your code here
        long totalSum = 0;
        for (long value : arr) {
            totalSum = totalSum + value;
        }

        Long maxValue = Long.MIN_VALUE;
        Long minValue = Long.MAX_VALUE;
        for (int position = 0; position < arr.size(); position++) {
            maxValue = Math.max(maxValue, arr.get(position));
            minValue = Math.min(minValue, arr.get(position));
        }
        System.out.println((totalSum - maxValue) + " " + (totalSum - minValue));
    }

    public static void main(String[] args) {
	// write your code here
        minMaxSum(Arrays.asList(1,2, 3, 4, 5));
        minMaxSum(Arrays.asList(7, 69, 2, 221, 8974));
        minMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625)); //2063136757 2744467344
        minMaxSum(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279)); // 2093989309 2548418794

    }


}
