package com.joeho;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean isAnagram(String s, String t) {
        boolean result = true;

        if (s.length() != t.length()) {
            result = false;
        }

        HashMap<Character, Integer> charMap =  new HashMap<>();
        for (char c: s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c, 1);
            }
        }
        for (char c: t.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)-1);
            } else {
                result = false;
                break;
            }
        }

        for (Map.Entry<Character, Integer> set: charMap.entrySet()) {
            if (set.getValue() != 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("anagram, nagaram: " + isAnagram("anagram", "nagaram"));
        System.out.println("rat, car: " + isAnagram("rat", "car"));
    }
}
