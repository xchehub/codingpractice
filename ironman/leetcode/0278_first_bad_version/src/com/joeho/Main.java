package com.joeho;

public class Main {

    public static int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int mi = 0;

        while (lo <= hi) {
            mi = (lo + hi) / 2;
            if (isBadVersion(mi)) {

            }
        }

        return 0;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
