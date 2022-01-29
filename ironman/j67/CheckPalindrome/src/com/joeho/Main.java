package com.joeho;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter a number:");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(Integer.toString(palindrome))) {
            System.out.println("The number " + palindrome + " is a palindrome.");
        } else {
            System.out.println("The number " + palindrome + " is not a palindrome.");
        }

        System.out.println("===================");
        if (isPalindrome(palindrome)) {
            System.out.println("The number " + palindrome + " is a palindrome.");
        } else {
            System.out.println("The number " + palindrome + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.length() == 1) {
            return true;
        }
        if (str.length() == 2) {
            if (str.charAt(0) == str.charAt(1)) {
                return true;
            }
            return false;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
