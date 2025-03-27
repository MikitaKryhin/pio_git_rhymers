package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = 12;
    private static final int INT1 = -1;
    private static final int INT2 = 11;
    private int[] NUMBERS = new int[INT];

    public int total = INT1;

    private int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == INT1;
    }

    protected boolean isFull() {
        return total == INT2;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return INT1;
        return NUMBERS[total--];
    }

}
