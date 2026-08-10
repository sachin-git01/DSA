/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node temp=new Node(val);
        if(pos==1){
            temp.next=head;
            head=temp;
            return head;
        }
        Node t=head;
        for(int i=1;i<pos-1;i++){
            t=t.next;
            
        }
        temp.next=t.next;
        t.next=temp;
        return head;
        
    }
}
