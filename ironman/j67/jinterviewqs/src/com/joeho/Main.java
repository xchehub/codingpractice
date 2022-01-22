package com.joeho;

import java.util.Arrays;

public class Main {

    public static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }

        String reverse ="";
        for (int i = source.length() -1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            System.out.println("remainder: " + remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("reverse: " + reverse);
            palindrome = palindrome / 10;
            System.out.println("palindrome: " + palindrome);
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromString(String text) {
        String reverse = recursionReverse(text);
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String recursionReverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static void main(String[] args) {
	// write your code here
        // https://www.java67.com/2012/09/top-10-tricky-java-interview-questions-answers.html
        // Double.MIN_VALUE is 2^(-1074)
        // It prints 0.0 because of Double.MIN_VALUE is greater than 0
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);

        System.out.println(1.0d/0.0d);

        Double x = Double.NaN;
        System.out.print("x == Double.NaN: ");
        System.out.println(x == Double.NaN ? "true" : "false");

        System.out.print("Double.isNaN(x): ");
        System.out.println(Double.isNaN(x) ? "true" : "false");

        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        // find palindrome numbers
//        isPalindrome(123);
//        isPalindrome(121);
//        isPalindrome(4567654);

        System.out.println("aabbaa: " + isPalindromString("aabbaa"));
        System.out.println("aabccfbaa: " + isPalindromString("aabccfbaa"));

        // Print Custom String Value of Java Enum
        System.out.println("Default String value of Java Enum Color.RED is " + Color.RED);
        System.out.println("Custom String value of Java Enum ColorWithToString.RED is " + ColorWithToString.RED);
        System.out.println("Custom String value of Enum in Java, ColorWithSpecificString.RED is "
                + ColorWithSpecificString.RED.getCustomString());

        for(Currency coin: Currency.values()) {
            System.out.println("coin: " + coin);
            System.out.println("coin color: " + coin.color());
        }
    }

    private enum Color {
        RED,
        GREEN,
        BLUE;
    }

    private enum ColorWithToString {
        RED {
            @Override
            public String toString() {
                return "Red";
            }
        },
        GREEN {
            @Override
            public String toString() {
                return "Green";
            }
        },
        BLUE {
            @Override
            public String toString() {
                return "Blue";
            }
        };
    }

    private enum ColorWithSpecificString {
        RED("red"),
        BLUE("blue"),
        GREEN("green");

        private String custom;

        private ColorWithSpecificString(String custom) {
            this.custom = custom;
        }

        public String getCustomString() {
            return custom;
        }
    }

    public enum Currency {
        PENNY(1) {
            @Override
            public String color() {
                return "copper";
            }
        },
        NICKLE(5) {
            @Override
            public String color() {
                return "bronze";
            }
        },
        DIME(10) {
            @Override
            public String color() {
                return "silver";
            }
        },
        QUARTER(25) {
            @Override
            public String color() {
                return "silver";
            }
        };

        private int value;

        private Currency(int value) {
            this.value = value;
        }
        public abstract String color();

        @Override
        public String toString() {
            switch(this) {
                case PENNY:
                    System.out.println("Penny:" + value);
                    break;
                case NICKLE:
                    System.out.println("Nickle: " + value);
                    break;
                case DIME:
                    System.out.println("Dime: " + value);
                    break;
                case QUARTER:
                    System.out.println("Quarter: " + value);
                    break;
            }

            return super.toString();
        }
    }
}
