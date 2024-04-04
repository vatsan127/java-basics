package org.example.temp;


import java.util.Scanner;

class Node {
    public Node(int data) {
        this.data = data;
    }

    int data;
    Node next;

}

class List {
    Node head;
    Node node;
    Node point;

    int size = 0;
    int cursor = 0;

    public void add(int data) {

        if (head == null) {
            node = new Node(data);
            head = node;
        } else {
            point = head;
            while (point.next != null) {
                point = point.next;
            }
            point.next = new Node(data);

        }
        size++;
    }

    public void insertAtHead(int data) {
        point = new Node(data);
        point.next = head;
        head = point;
        size++;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtHead(data);
        } else {

            point = head;
            int count = 0;
            while (point.next != null && count < index - 1) {
                point = point.next;
                count++;
            }
            Node newNode = point.next;
            point.next = new Node(data);
            point = point.next;
            point.next = newNode;
        }


    }

    public void operations(boolean pointing, int data) {
        if (pointing) {
            cursor++;
        } else {
            if (cursor > 0) {
                cursor--;
            } else {
                cursor = 0;
            }
        }
        insertAt(cursor, data);

    }

    public void show() {
        Node node1 = head;
        System.out.print("size : " + size+ " data: ");
        while (node1.next != null) {
            System.out.print(node1.data + "");
            node1 = node1.next;
        }
        System.out.println(node1.data);
    }

}

public class Run {
    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.show();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("pointer : ");
            int value = scanner.nextInt();
            System.out.print("data : ");
            int data = scanner.nextInt();
            System.out.println();
            list.operations(value > 0, data);
            list.show();
        }

    }
}