package LinkedList.Singly;

public class SinglyLinkedList {
    ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second =  new ListNode(2);

        head.next = second;
    }
}
