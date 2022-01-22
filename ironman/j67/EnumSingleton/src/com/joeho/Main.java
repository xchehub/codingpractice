package com.joeho;

public class Main {

    /**
     * Singleton pattern example with Double-checked Locking
     */
    public class DoubleCheckedLockingSingleton {
        private volatile DoubleCheckedLockingSingleton INSTANCE;

        private DoubleCheckedLockingSingleton() {}

        public DoubleCheckedLockingSingleton getInstance() {
            if (INSTANCE == null) {
                synchronized (DoubleCheckedLockingSingleton.class) {
                    // Double-checking Singleton instance
                    if (INSTANCE == null) {
                        INSTANCE = new DoubleCheckedLockingSingleton();
                    }
                }
            }
            return INSTANCE;
        }
    }

    // Singleton pattern example with static factory method.
    public static class Singleton {
        // Init during class loading
        private static final Singleton INSTANCE = new Singleton();

        // prevent creating another instance of Singleton
        private Singleton() {};

        public static Singleton getSingleton() {
            return INSTANCE;
        }
    }

    public static void main(String[] args) {
	// write your code here
    }
}
