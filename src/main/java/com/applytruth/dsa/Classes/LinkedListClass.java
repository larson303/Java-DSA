package com.applytruth.dsa.Classes;

public class LinkedListClass {

    private Node head;
    private Node tail;
    private int length;

    class Node { // Since this class is only used in LinkedListClass, it is a good idea to make it a nested class
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

    }

    public LinkedListClass(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
        this.length++;
    }

    public void insert(int index, int value) {
        if (index >= this.length) {
            append(value);
        } else if (index == 0) {
            prepend(value);
        } else {
            Node newLinkedListNode = new Node(value);
            Node leader = traverseToIndex(index - 1);
            Node holdingPointer = leader.getNext();
            leader.setNext(newLinkedListNode);
            newLinkedListNode.setNext(holdingPointer);
            this.length++;
        }
    }

    public Node traverseToIndex(int index) {
        int counter = 0;
        Node currentLinkedListNode = this.head;
        while (counter != index) {
            currentLinkedListNode = currentLinkedListNode.getNext();
            counter++;
        }
        return currentLinkedListNode;
    }

    @Override
    public String toString() {
        return "LinkedListClass{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
