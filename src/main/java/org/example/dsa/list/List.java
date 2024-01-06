package org.example.dsa.list;

public interface List {
    public void add(int data);
    public int get(int index);
    public boolean contains(int data);
    public void remove(int index);
    public int size();
    public void print();
    public boolean isEmpty();
}
