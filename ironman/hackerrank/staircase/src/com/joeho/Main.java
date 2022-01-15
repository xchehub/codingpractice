package com.joeho;

public class Main {

    public static void staircase(int n) {
        // Write your code here
        for (int x = 0; x < n ; x++) {
            String spaceStr = new String(new char[n - x - 1]).replace("\0", " ");
            String sharpStr = new String(new char[x + 1]).replace("\0", "#");
            System.out.println(spaceStr + sharpStr);
        }
    }

    public static void main(String[] args) {
	// write your code here
        staircase(6);
    }
}
