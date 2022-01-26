package com.joeho;

import java.util.concurrent.Callable;


public class Main {
    static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        var future =  Future.submit(() -> fibonacci(30));
        System.out.println("Fibonacci 30 ...");
        while (!future.isDone()) {
            System.out.println("Do your business");
        }
        System.out.printf("The 30rd fibonacci: %d%n", future.get());
    }

}

class Future<T> implements Runnable {
    private Callable<T> callable;
    private T r;

    Future(Callable<T> callable) {
        this.callable = callable;
    }

    boolean isDone() {
        return r != null;
    }

    synchronized T get() throws InterruptedException {
        while (r == null) {
            wait();
        }
        return r;
    }

    @Override
    public void run() {
        try {
            synchronized (this) {
                r = callable.call();
                notify();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static <T> Future<T> submit(Callable<T> callable) {
        var future = new Future<>(callable);
        new Thread(future).start();
        return future;
    }
}