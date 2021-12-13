package com.joeho;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static int calPoints(String[] ops) {
        List<Integer> s = new LinkedList<>();

        for (String op: ops) {
            int n = s.size();
            if (op.equals("C")) {
                s.remove(n-1);
            } else if (op.equals("D")) {
                s.add(s.get(n-1) * 2);
            } else if (op.equals("+")) {
                s.add(s.get(n-1) + s.get(n-2));
            } else {
                s.add(Integer.parseInt(op));
            }
        }

        return s.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
	    // write your code here
        String[] ops = new  String[]{"5","2","C","D","+"};
        System.out.println(Arrays.toString(ops) + ": " + calPoints(ops));
        ops = new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(Arrays.toString(ops) + ": " + calPoints(ops));
        ops = new String[]{"1"};
        System.out.println(Arrays.toString(ops) + ": " + calPoints(ops));

    }
}
