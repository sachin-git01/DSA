/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
           while(head1!=null){
            set.add(head1.data);
            head1=head1.next;
        }
           while(head2!=null){
            set.add(head2.data);
            head2=head2.next;
        }
           Node dummy = new Node(0);
        Node temp = dummy;

        for (int x : set) {
            temp.next = new Node(x);
            temp = temp.next;
        }

        return dummy.next;
    }
}
