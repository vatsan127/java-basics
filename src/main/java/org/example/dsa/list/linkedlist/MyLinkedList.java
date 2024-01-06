package org.example.dsa.list.linkedlist;

import org.example.dsa.list.List;

import javax.lang.model.type.NullType;


/*Node class for singly LinkedList*/
class Node {
    int data;
    Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

}

public class MyLinkedList implements List {
    Node head;

    @Override
    public void add(int data) {

        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }

    }

    @Override
    public int get(int index) {
        if (head == null || (index >= size())) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            return head.data;
        }
        Node n = head;
        int location = 0;
        while (n.next != null && location < index) {
            n = n.next;
            location++;
        }
//        n = n.next;
        return n.data;
    }

    @Override
    public boolean contains(int data) {
        if (head == null) {
            return false;
        }
        Node n = head;
        while (n.next != null) {
            if (n.data == data) {
                return true;
            }
            n = n.next;
        }
        return n.data == data;
    }

    @Override
    public void remove(int index) {
        if (head == null || (index >= size())) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;

        } else {
            int location = 0;
            Node n = head;
            while (location < index - 1) {
                n = n.next;
                location++;
            }
            Node nextNode = n.next;
            n.next = nextNode.next;
        }
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node n = head;
        while (n.next != null) {
            n = n.next;
            size++;
        }
        return size + 1;
    }

    public void print() {
        if (head == null) return;
        Node n = head;
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        while (n.next != null) {
            str.append(n.data + ", ");
            n = n.next;
        }
        str.append(n.data + " ]");
        System.out.println(str);
    }


    @Override
    public boolean isEmpty() {
        return (head == null);
    }
}
