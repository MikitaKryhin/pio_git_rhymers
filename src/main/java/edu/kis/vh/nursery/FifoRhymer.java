package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    // Zmienna 'temp' oznaczone jako final, ponieważ nie będziemy zmieniać referencji do tego obiektu
    public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
