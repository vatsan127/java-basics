package org.example.dsa.tree;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(5);
        tree.insert(2);


        tree.inOrder();
        tree.preOrder();
    }
}
