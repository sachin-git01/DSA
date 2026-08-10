class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head== null || head.next==null) return head;
         ListNode even=head.next;
         ListNode odd=head;
         ListNode FirstEven=head.next;
         
         while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            
            even=even.next;
         }
         odd.next=FirstEven;
         return head;
        
    }
}
