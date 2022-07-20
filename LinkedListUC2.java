package com.bridgelabz.linkedlist;

//    Ability to create Linked List by adding 30 and 56to 70
public class LinkedListUC2 {
    public Node head;
    public Node tail;
    int next;

    public static void main(String[] args) {
        LinkedListUC2 linkedlist = new LinkedListUC2();
        linkedlist.addNode(70);
        linkedlist.addNode(30);
        linkedlist.addNode(56);
        linkedlist.displayNode();
    }
    public void addNode(int data) {
        Node currentNode = new Node(data);

        currentNode.data = data;
        currentNode.next = head;
        if (next == 0) {
            tail = currentNode;
        }
        head = currentNode;
        next++;
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