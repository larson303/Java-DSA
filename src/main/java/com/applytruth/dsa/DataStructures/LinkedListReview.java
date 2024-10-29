package com.applytruth.dsa.DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListReview {

    public void ShowLinkedList() {
        // LinkedList is a class that implements the List interface
        // It is not synchronized and is not thread safe
        // It is faster than ArrayList for adding or removing elements
        // It is slower than ArrayList for accessing elements

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");

        System.out.println(shoppingList);
        System.out.println("=====================================");

        shoppingList.add(1, " mango");
        System.out.println(shoppingList);

        System.out.println("=====================================");
        for(String item : shoppingList) {
            System.out.println(item);
        }
        System.out.println("=====================================");


        List<String> synchronizedFruits = Collections.synchronizedList(shoppingList);
        System.out.println(synchronizedFruits);

    }

    public void run() {
        ShowLinkedList();
    }
}
