class Solution {
    public Node removeLastNode(Node head) {
        // code here
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
            
        }
        temp.next=null;
        return head;
    }
}





void deleteFirst() {
if(head == null)
return;
head = head.next;
}
