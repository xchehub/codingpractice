package com.joeho;

public class Main {

    public class JuniorStudent implements Comparable<JuniorStudent> {
        private int id;
        private String name;
        private int age;

        /**
         * Compare a Student with the current(this) object.
         * First compare name and then age
         */
        @Override
        public int compareTo(JuniorStudent o) {

            //compare name
            int nameDiff = name.compareToIgnoreCase(o.name);
            if (nameDiff != 0) {
                return nameDiff;
            }
            //names are equals compare to age
            return age - o.age;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
