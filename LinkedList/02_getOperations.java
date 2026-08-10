📌 1. Get First Element
int getFirst(Node head) {
    return head.data;
}
📌 2. Get Last Element
int getLast(Node head) {
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    return temp.data;
}
📌 3. Get Element at Index (0-based)
int getAt(Node head, int idx) {
    Node temp = head;

    for (int i = 0; i < idx; i++) {
        temp = temp.next;
    }

    return temp.data;
}
📌 4. Get Middle Element
int getMiddle(Node head) {

    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow.data;
}
📌 5. Get Kth Element from End
int getKthFromEnd(Node head, int k) {

    Node slow = head;
    Node fast = head;

    for (int i = 0; i < k; i++) {
        fast = fast.next;
    }

    while (fast != null) {
        slow = slow.next;
        fast = fast.next;
    }

    return slow.data;
}
