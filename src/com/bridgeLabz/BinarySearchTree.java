package com.bridgeLabz;

public class BinarySearchTree<T extends Comparable<T>> {
    private MyNode<T> root;

    public void add(T data) {
        this.root = this.addRecursively(root, data);
    }

    private MyNode<T> addRecursively(MyNode<T> currentNode, T data) {

        if (currentNode == null)
            return new MyNode<>(data);

        if (data.compareTo(currentNode.data) > 0)
            currentNode.right = addRecursively(currentNode.right, data);
        else if (data.compareTo(currentNode.data) < 0)
            currentNode.left = addRecursively(currentNode.left, data);

        return currentNode;
    }

    public void getSize() {
        int size = getSizeRecursively(root);

        if (size == 0)
            System.out.println("Tree is empty");
        else
            System.out.println("Elements in tree = " + size);
    }

    private int getSizeRecursively(MyNode<T> root) {
        int size;

        if (root == null)
            size = 0;
        else
            size = this.getSizeRecursively(root.left) + 1 + this.getSizeRecursively(root.right);

        return size;
    }
}