class Solution {

    Node deleteAtPosition(Node head, int pos) {

        if (head == null) {
            return null;
        }

        if (pos == 1) {
            return head.next;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 ; i++) {
            temp = temp.next;
        }

     

        temp.next = temp.next.next;

        return head;
    }
}
