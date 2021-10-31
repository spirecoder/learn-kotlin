
package com.spirecoder;

import kotlin.jvm.JvmStatic

internal class LinkedListMiddleElement(private var head: Node) {
    class Node(var data: Int, var next: Node)

    val midNode: Node
        get() {
            if (head == null || head.next == null) {
                return head
            }
            var t1 = head
            var t2 = head.next
            while (t2 != null && t2.next != null) {
                t1 = t1.next
                t2 = t2.next.next
            }
            return t1
        }

    fun push(data: Int) {
        head = Node(data, head)
    }

    fun printList() {
        var temp = head
        while (temp != null) {
            print(temp.data.toString() + "-> ")
            temp = temp.next
        }
        println("null")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val head = Node(1, null)
            val middleElement = LinkedListMiddleElement(head)
            middleElement.push(2)
            middleElement.push(3)
            middleElement.push(4)
            middleElement.push(5)
            middleElement.push(6)
            middleElement.push(7)
            middleElement.printList()
            println("Mid element: " + middleElement.midNode.data)
        }
    }
}