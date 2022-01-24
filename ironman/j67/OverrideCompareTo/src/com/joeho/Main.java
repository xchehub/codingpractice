package com.joeho;

public class Main {

    public class JuniorStudent implements Comparable<JuniorStudent> {
        private int id;
        private String name;
        private int age;

        @Override
        public int compareTo(JuniorStudent o) {
            int nameDiff = name.compareToIgnoreCase(o.name);
            if (nameDiff != 0) {
                return nameDiff;
            }
            return age - o.age;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
