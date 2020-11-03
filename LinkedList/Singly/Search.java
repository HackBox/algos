package LinkedList.Singly;

public class Search {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode() {
        }

        boolean searchNode(ListNode n, int data) {
            while (n != null) {
                if (n.data == data)
                    return true;
                else
                    n = n.next;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(1);
        ListNode forth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println(new ListNode().searchNode(head, 4));
    }
}
