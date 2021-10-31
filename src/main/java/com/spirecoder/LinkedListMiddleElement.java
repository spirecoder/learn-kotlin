package com.spirecoder;

class LinkedListMiddleElement {

    private Node head;

    LinkedListMiddleElement(Node head) {
        this.head = head;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node getMidNode() {
        if (head == null || head.next == null) {
            return head;
        }
        Node t1 = head;
        Node t2 = head.next;
        while (t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
        }
        return t1;
    }

    void push(int data) {
        head = new Node(data, head);
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        LinkedListMiddleElement middleElement = new LinkedListMiddleElement(head);
        middleElement.push(2);
        middleElement.push(3);
        middleElement.push(4);
        middleElement.push(5);
        middleElement.push(6);
        middleElement.push(7);

        middleElement.printList();

        System.out.println("Mid element: " + middleElement.getMidNode().data);
    }
}
