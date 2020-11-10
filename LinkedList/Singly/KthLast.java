package LinkedList.Singly;

public class KthLast {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(6);
        Node fourth = new Node(2);

        head.next = second;
        second.next = third;
        third.next = fourth;

       Node finalNode = new KthLast().kthLast(head, 2);
       System.out.println(finalNode.data);
    }
    Node kthLast(Node n, int k) {
        Node n1 = n;
        Node n2 = n;

        //n1 reaches to kth element
        for (int i = 0; i < k; i++) {
            if (n1 == null)
                return null;
            n1 = n1.next;
        }

        // n2 starts journey till n1 reaches end
        while(n1 != null){
            n1 = n1.next;
            n2 = n2.next;
        }

        return n2;

    }
}