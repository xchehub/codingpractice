package com.joeho;

public class Main {
    public static void method(Float f) {  // changed from "float" to "Float"
        System.out.println("float");
    }

    public static void method(int i) {
        System.out.println("int");
    }

    public static void method(double d) {
        System.out.println("double");
    }
    public static void main(String[] args) {
	// write your code here
        method(10.2f);
        method(10.21010);
    }
}
