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

fun findMiddle(head: ListNode?): ListNode? {

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
    val dummy = ListNode("0").apply {
        next = head
    }
    var fast: ListNode? = dummy
    var slow: ListNode? = dummy

    repeat ( n + 1) {
        fast = fast?.next
    }

    while (fast != null && fast.next != null) {
        slow = slow?.next
        fast = fast.next
    }
    slow?.next = slow.next?.next

    return dummy.next
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    val dummy = ListNode("")
    var current: ListNode? = dummy
    var ptr1 = l1
    var ptr2 = l2

    while (ptr1 != null && ptr2 != null) {
        if (ptr1.value <= ptr2.value) {
            current?.next = ptr1
            ptr1 = ptr1.next
        } else {
            current?.next = ptr2
            ptr2 = ptr2.next
        }
        current = current?.next
    }

    current?.next = ptr1 ?: ptr2

    return dummy.next
}

fun isPalindrome(head: ListNode?): Boolean {
    val middle = findMiddle(head)
    val revListHead = middle?.next
    var current = head
    var revList = reverseList(revListHead)
    while (revList?.next != null) {
        if (current?.value == revList.value) {
            current = current.next
            revList = revList.next
            continue
        } else
            return false
    }
    return true
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