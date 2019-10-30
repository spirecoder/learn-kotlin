package com.spirecoder;

class Node<T>(val: T){
    var val:T = val
    var next: Node<T>? = null
    var prev:Node<T>? = null
}

class LinkedList<T> {
    private var head:Node<T>? = null
    var isEmpty:Boolean = head == null
    fun first():Node<T>? = head
    fun last(): Node<T>? {
            var node = head
            if (node != null){
                while (node?.next != null) {
                    node = node?.next
                }
                return node
            } else {
                return null
            }
    }
    fun insert(val: T) {
        var newNode = Node(val)
        var lastNode = this.last()
        if (lastNode != null) {
            newNode.prev = lastNode
            lastNode.next = newNode
        } else {
            head = newNode
        }
    }

    fun delete(node: Node<T>):T {
        val prev = node.prev
        val next = node.next
        if (prev != null) {
            prev.next = next
        } else {
            head = next
        }
        next?.prev = prev
        node.prev = null
        node.next = null
        return node.val
    }
}