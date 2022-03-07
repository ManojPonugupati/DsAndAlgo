package Queues;


import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek : " + q.peek());
        System.out.println("Peek last element : " + ((ArrayDeque<Integer>) q).peekLast());
        System.out.println("size before poll " + q.size());
        System.out.println("Poll : " +  q.poll());
        System.out.println("size after poll " + q.size());
    }
}
