package com.joeho;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveCounter = 0;
        float negativeCounter = 0;
        float zeroCounter = 0;

        for (int num: arr) {
            if (num > 0) {
                positiveCounter++;
            } else if (num <0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }

        System.out.println(positiveCounter / arr.size());
        System.out.println(negativeCounter / arr.size());
        System.out.println(zeroCounter / arr.size());
    }

    public static void main(String[] args) {
	// write your code here
        plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1));
//        plusMinus(Arrays.asList(1, 2, 3, -1, -2 ,-3, 0, 0));
    }
}
