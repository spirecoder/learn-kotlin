package com.spirecoder

import kotlin.jvm.JvmStatic
import com.spirecoder.RemoveDuplicateNodes

class RemoveDuplicateNodes {
    class Node {
        var value: Int
        var next: Node? = null

        constructor(value: Int) {
            this.value = value
        }

        constructor(value: Int, next: Node?) {
            this.value = value
            this.next = next
        }
    }

    fun deleteDuplicates(head: Node?): Node? {
        // sentinel
        var head = head
        val sentinel = Node(0, head)

        // predecessor = the last node
        // before the sublist of duplicates
        var pred: Node? = sentinel
        while (head != null) {
            // if it's a beginning of duplicates sublist
            // skip all duplicates
            if (head.next != null && head.value == head.next!!.value) {
                // move till the end of duplicates sublist
                while (head!!.next != null && head.value == head.next!!.value) {
                    head = head.next
                }
                // skip all duplicates
                pred!!.next = head.next
                // otherwise, move predecessor
            } else {
                pred = pred!!.next
            }

            // move forward
            head = head.next
        }
        return sentinel.next
    }

    fun print(head: Node?) {
        var temp = head
        while (temp != null && temp.next != null) {
            print(temp.value.toString() + "->")
            temp = temp.next
        }
        if (temp != null) {
            print(temp.value)
        }
    }

    companion object {
        @JvmStatic
        fun main(arg: Array<String>) {
            val instance = RemoveDuplicateNodes()
            var head: Node? = Node(0, Node(2, Node(3, Node(3, Node(4)))))
            head = instance.deleteDuplicates(head)
            instance.print(head)
        }
    }
}