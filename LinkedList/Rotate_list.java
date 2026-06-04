class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int n = 1;

        while (temp.next != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;
  temp.next=head; //circuar
           temp=head;
        for (int i = 0; i < n - k - 1; i++) {
            temp = temp.next;
        }
         
         
        ListNode newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
