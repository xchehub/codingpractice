import java.util.*;

public class javaQueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        System.out.println(queue.offer(32));
        System.out.println(queue.offer(4));
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println();
        System.out.println();
       
    }
}