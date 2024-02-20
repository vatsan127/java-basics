package org.example.dsa.queue;

public class MyQueue {

    int arr[] = new int[5];

    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public void enqueue(int data) {
        arr[rear] = data;
        rear++;
        size++;
    }

    public int dequeue() {
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public void show() {
        StringBuilder printer = new StringBuilder();
        for (int i = front; i < rear; i++) {
            printer.append(arr[i]);
        }
        String result = String.join(", ", printer.toString().split(""));
        System.out.println("[" + result + "]");
    }

}
