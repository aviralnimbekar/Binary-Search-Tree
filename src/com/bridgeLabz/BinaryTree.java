package com.bridgeLabz;

import java.util.Scanner;

/**
 * Purpose - To create a Binary Tree structure to store data
 *
 * @author - Aviral N
 */
public class BinaryTree {

    public static void main(String[] args) {
        BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter element: ");
            int input = scanner.nextInt();
            if (input == 0)
                break;

            binaryTree.add(input);
        }
        binaryTree.getSize();

        System.out.println("Enter data to search");
        int searchData = scanner.nextInt();
        binaryTree.searchElement(searchData);
    }
}