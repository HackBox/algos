package Stack;

import java.util.EmptyStackException;

//Creating a stack using linked list schema
public class MyStack {
    static class StackNode<Integer> {
        Integer data;
        StackNode<Integer> next;

        StackNode(Integer data) {
            this.data = data;
        }
    }

    StackNode<Integer> top;

    // Returns the value
    Integer pop() {
        if (top == null)
            throw new EmptyStackException();
        Integer data = top.data;
        top = top.next;
        return data;
    }

    Integer push(Integer data) {
        StackNode<Integer> t = new StackNode<Integer>(data);
        t.next = top;
        top = t;
        return top.data;
    }

    Integer peek() {
        if (top == null)
            throw new EmptyStackException();
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

}
