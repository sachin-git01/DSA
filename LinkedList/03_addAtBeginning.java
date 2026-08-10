class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
         return head;
    }
   
}
