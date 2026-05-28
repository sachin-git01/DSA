/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {

    Node insertAtMiddle(Node head, int x) {

        Node newNode = new Node(x);

        // Empty list
        if(head == null){
            return newNode;
        }

        Node slow = head;
        Node fast = head;

        // Find middle
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Insert after middle
        newNode.next = slow.next;
        slow.next = newNode;

        return head;
    }
}
