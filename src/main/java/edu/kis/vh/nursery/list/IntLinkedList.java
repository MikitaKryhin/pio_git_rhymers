package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

}
