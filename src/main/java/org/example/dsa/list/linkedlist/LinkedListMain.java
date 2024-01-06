package org.example.dsa.list.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(10);
        linkedList.print();

        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

        linkedList.remove(1);
        linkedList.print();

        System.out.println(linkedList.get(3));

        linkedList.insertAt(0,9);
        linkedList.print();
    }
}
