package com.joeho;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
* determine if the input string is valid.
* An input string is valid if:
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* */

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static boolean isValid(String s) {
        HashMap<Character, Character> symbolMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        symbolMap.put('(', ')');
        symbolMap.put('{', '}');
        symbolMap.put('[', ']');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c)) {
                if (symbolMap.containsKey(c)) {
                    if (!stack.isEmpty() && symbolMap.get(stack.peek()) != c) {
                        stack.add(c);
                    } else if (stack.isEmpty()) {
                        stack.add(c);
                    } else {
                        stack.pop();
                    }
                } else if (c == ')' || c == '}' || c == ']') {
                    if (!stack.isEmpty() && symbolMap.get(stack.peek()) == c) {
                        stack.pop();
                    } else if (stack.isEmpty()) {
                        return false;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println("1: () " + isValid("()"));
        System.out.println("2: ()[]{} " + isValid("()[]{}"));
        System.out.println("3: (] " + isValid("(]"));
        System.out.println("4: ([)] " + isValid("([)]"));
        System.out.println("5: {[]} " + isValid("{[]}"));
        System.out.println("6: ] " + isValid("]"));

    }
}
