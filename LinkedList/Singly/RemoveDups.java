package LinkedList.Singly;

import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(10);
        Node third = new Node(10);
        Node fourth = new Node(2);

        head.next = second;
        second.next = third;
        third.next = fourth;

        new RemoveDups().removeDups(head);
    }

    void removeDups(Node node){
        Node prev = null;
        HashSet<Integer> set = new HashSet<Integer>();

        while(node != null){
            if(set.contains(node.data)){
                prev.next= node.next;
                node = node.next;
            }
            else{
                set.add(node.data);
                prev = node;
                node = node.next;
            }
        }
    }
}