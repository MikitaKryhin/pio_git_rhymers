package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = 12;
    public static final int INT1 = -1;
    public static final int INT2 = 11;
    private int[] NUMBERS = new int[INT];

    public int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == INT2;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return NUMBERS[total--];
    }

}
