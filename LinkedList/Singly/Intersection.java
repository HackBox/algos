package LinkedList.Singly;

public class Intersection {

    public static void main(String[] args) {

        // Crating List 1
        Node l11 = new Node(1);
        Node l12 = new Node(4);
        Node l13 = new Node(7);
        Node l14 = new Node(3);
        Node l15 = new Node(1);
        Node l16 = new Node(2);

        l11.next = l12;
        l12.next = l13;
        l13.next = l14;
        l14.next = l15;
        l15.next = l16;

        // Crating List 2
        Node l21 = new Node(5);
        Node l22 = new Node(4);
        Node l23 = new Node(3);
        Node l24 = new Node(1);
        Node l25 = new Node(2);

        l21.next = l22;
        l22.next = l23;
        l23.next = l24;
        l24.next = l25;

        System.out.println(new Intersection().findIntersection(l11, l21));
    }

    int findIntersection(Node list1, Node list2) {
        if (list1 == null || list2 == null) {
            System.out.println("thuss...");
            return -1;
        }
        Result r1 = getTailAndSize(list1);
        Result r2 = getTailAndSize(list2);

        if (r1.tail.data != r2.tail.data) {
            return -1;
        }

        Node shorter = r1.length < r2.length ? list1 : list2;
        Node longer = r1.length < r2.length ? list2 : list1;

        longer = getKthNode(longer, Math.abs(r1.length - r2.length));

        while (longer.data != shorter.data) {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer.data;
    }

    Result getTailAndSize(Node n) {
        int count = 1;

        Node current = n;
        while (current.next != null) {
            count++;
            current = current.next;
        }

        return new Result(count, current);
    }

    Node getKthNode(Node n, int num) {
        Node head = null;
        for (int i = 0; i < num; i++) {
            head = n.next;
        }
        return head;
    }

}

class Result {
    int length;
    Node tail;

    Result(int l, Node n) {
        this.length = l;
        this.tail = n;
    }
}