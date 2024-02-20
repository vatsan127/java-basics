package org.example.dsa.queue;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.show();
        System.out.println("Size : " + queue.size());


        queue.dequeue();
        queue.show();
        System.out.println("Size : " + queue.size());

        queue.enqueue(7);
        queue.show();
        System.out.println("Size : " + queue.size());


    }
}
