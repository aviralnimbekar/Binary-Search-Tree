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
}