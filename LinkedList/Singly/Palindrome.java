package LinkedList.Singly;

public class Palindrome {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(10);
        Node fourth = new Node(5);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        System.out.println(new Palindrome().isPalindrome(head));

    }

    boolean isPalindrome(Node n) {
        Node reversed = reverseAndClone(n);
        return isEqual(n, reversed);
    }

    Node reverseAndClone(Node n) {
        // head for reversed linkedlist
        Node head = null;

        // Lets reverse the given linked list
        while (n != null) {
            Node temp = new Node(n.data); // Creating a temporary node
            temp.next = head; // head becomes temporary node next node
            head = temp; // swapping head with temporary node
            n = n.next; // continues looping
        }

        //returning the reversed list head node
        return head;
    }

    boolean isEqual(Node main, Node reversed) {

        //Traversing linked list
        while (main != null && reversed != null) {
            if (main.data != reversed.data) {
                return false;
            }
            main = main.next;
            reversed = reversed.next;
        }

        //all nodes are checked and completed
        return main == null && reversed == null;
    }
}
