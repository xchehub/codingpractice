package com.joeho;

import java.util.concurrent.*;

public class Main {
    static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
	// write your code here
        var future =  Future.submit(() -> fibonacci(5));
        System.out.println("Fibonacci 5 ...");
        while (!future.isDone()) {
            System.out.println("Do your business");
        }
        System.out.printf("The 5th fibonacci: %d%n", future.get());

        System.out.println("Using FutureTask");

        var futureTask = new FutureTask<>(() -> fibonacci(10));
        new Thread(futureTask).start();
        System.out.println("Fibonacci 10...");
        while(!futureTask.isDone()) {
            System.out.println("Do your business");
        }
        System.out.printf("10th fibonacci: %d%n", futureTask.get());

        System.out.println("Using ExecutorService");
        var service = Executors.newCachedThreadPool();
        var future2 = service.submit(() -> fibonacci(15));
        System.out.println("Fibonacci 15...");
        while(!future2.isDone()) {
            System.out.println("Do your business");
        }
        System.out.printf("15th fibonacci: %d%n", future2.get());
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