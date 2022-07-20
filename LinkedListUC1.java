package com.bridgelabz.linkedlist;

//    Create a simple Linked List of 56, 30 and 70
public class LinkedListUC1 {
    public Node head = null;
    public Node tail = null;

    public static void main(String[] args) {
        LinkedListUC1 linkedlist = new LinkedListUC1();
        linkedlist.addNode(56);
        linkedlist.addNode(30);
        linkedlist.addNode(70);
        linkedlist.displayNode();
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayNode() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}