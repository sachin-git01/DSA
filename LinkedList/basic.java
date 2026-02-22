// Node class without constructor
class Node {
    int val;        // data of node
    Node next;      // reference to next node
}

public class basic {

    // printing linked list using normal (iterative) method
    public static void print(Node head) {
        Node temp = head;              // start from head
        while (temp != null) {         // traverse till end
            System.out.println(temp.val); // print current node value
            temp = temp.next;          // move to next node
        }
    }

    // printing linked list using recursion
    public static void printRec(Node head) {
        if (head == null) return;      // base case
        System.out.println(head.val);  // print current node value
        printRec(head.next);           // recursive call for next node
    }

    public static void main(String[] args) {

        // creating nodes
        Node a = new Node();
        a.val = 10;

        Node b = new Node();
        b.val = 20;

        Node c = new Node();
        c.val = 30;

        // linking nodes: a -> b -> c -> null
        a.next = b;
        b.next = c;

        // normal print
        print(a);

        // recursive print
        printRec(a);
    }
}



// with constructoer
// Node class for Linked List
class Node {
    int val;        // data of node
    Node next;      // reference to next node

    // constructor
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class basic {

    // printing linked list using normal (iterative) method
    public static void print(Node head) {
        Node temp = head;              // start from head
        while (temp != null) {         // traverse till end
            System.out.println(temp.val); // print current node value
            temp = temp.next;          // move to next node
        }
    }

    // printing linked list using recursion
    public static void printRec(Node head) {
        if (head == null) return;      // base case
        System.out.println(head.val);  // print current node value
        printRec(head.next);           // recursive call for next node
    }

    public static void main(String[] args) {

        // creating nodes
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        // linking nodes: a -> b -> c -> null
        a.next = b;
        b.next = c;

        // normal print
        print(a);

        // recursive print
        printRec(a);
    }
}



// rec print

    public static void printRec(Node head) {
        if (head == null) return;      // base case: end of list
        System.out.println(head.val);  // print current node value
        printRec(head.next);           // recursive call for next node
    }

// rev print
    public static void printRec(Node head) {
        if (head == null) return;      // base case: end of list
        printRec(head.next);           // recursive call for next node
        System.out.println(head.val);  // print current node value
        
    }





// Node a = null;

// Here’s what it means in the context of a linked list:

// 🧠 Explanation

// 1️⃣ a is a reference variable of type Node.
// 2️⃣ = null means it doesn’t point to any node yet.
// 3️⃣ If you try to do a.val or a.next, you get:

// NullPointerException
