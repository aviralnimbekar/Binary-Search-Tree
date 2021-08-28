package com.bridgeLabz;

public class MyNode<T> {
    T data;
    MyNode<T> left;
    MyNode<T> right;

    public MyNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
