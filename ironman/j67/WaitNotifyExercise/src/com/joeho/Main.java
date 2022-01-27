package com.joeho;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<String> q = new LinkedList<>();
        boolean exit = false;
        Producer p = new Producer(q, exit);
        p.start();
        Consumer c = new Consumer(q, exit);
        c.start();

    }
}

class Producer extends Thread {
    private volatile Queue<String> sharedQueue;
    private volatile boolean bExist;

    public Producer(Queue<String> myQueue, boolean bExist) {
        this.sharedQueue = myQueue;
        this.bExist = bExist;
    }

    public void run() {
        while (!bExist) {
            synchronized(sharedQueue) {
                while (sharedQueue.isEmpty()) {
                    String item = String.valueOf(System.nanoTime());
                    sharedQueue.add(item);
                    System.out.println("Producer added: " + item);
                    try {
                        System.out.println("Produce sleeping by calling wait:" + item);
                        sharedQueue.wait();
                        System.out.println("Produce woke up: ");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Consumer extends Thread {
    private volatile Queue<String> sharedQueue;
    private volatile boolean bExist;

    public Consumer(Queue<String> myQueue, boolean bExist) {
        this.sharedQueue = myQueue;
        this.bExist = bExist;
    }

    public void run() {
        while (!bExist) {
            synchronized(sharedQueue) {
                while (!sharedQueue.isEmpty()) {
                    //    System.out.println("Consumer sleeping by calling wait:");
//                        sharedQueue.wait();
//                        System.out.println("Consumer woke up: ");
                    String item = sharedQueue.poll();
                    System.out.println("Consumer removed: " + item);
                    System.out.println("Consumer notify produce: " + item);
                    sharedQueue.notify();
                }
//                String item = sharedQueue.remove();
//                System.out.println("Consumer removed: " + item);
//                sharedQueue.notify();
            }
        }
    }
}