package org.example

class ListNode(val value: String) {
    var next: ListNode? = null
}


fun printList(head: ListNode?) {
    var current = head
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    print("null")
}

fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current: ListNode? = head
    var next: ListNode? = null

    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}

fun findMiddle(head: ListNode): ListNode? {

    var fast: ListNode? = head
    var slow: ListNode? = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    return slow
}

fun hasCycle(head: ListNode?): Boolean {
    var fast: ListNode? = head
    var slow: ListNode? = head

    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next?.next
        if (slow == fast) return true
    }
    return false
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var fast: ListNode? = head
    var slow: ListNode? = head

    repeat ( n) {
        fast = fast?.next
    }

    while (fast != null && fast.next != null) {
        slow = slow?.next
    }
}

fun main() {
    // Create nodes
    val node1 = ListNode("10")
    val node2 = ListNode("20")
    val node3 = ListNode("30")
    val node4 = ListNode("40")
    val node5 = ListNode("50")
    // Connect nodes
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    // Head of the list
    val head = node1

    val mid = findMiddle(head)
    val revList = reverseList(head)

    val hasCycle = hasCycle(head)
    println("hasCycle = $hasCycle")
    // Print list
    println(mid?.value)
}