package org.example.dsa.tree;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    Node root;

    public void insert(int data) {
        root = insertRecur(root, data);
    }

    private Node insertRecur(Node root, int data) {
        System.out.println(root);
        if (root == null)
            root = new Node(data);
        else if (data < root.data)
            root.left = insertRecur(root.left, data);
        else if (data > root.data)
            root.right = insertRecur(root.right, data);

        return root;
    }

    public void inOrder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }

}
