package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class RhymersDemo {

    private static final int INT = 15;
    private static final int I = 1;
    private static final int INT1 = 3;
    private static final int J = 0;
    private static final int BOUND = 20;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = {factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};

        for (int i = I; i < INT; i++)
            for (int j = J; j < INT1; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = I; i < INT; i++)
            rhymers[INT1].countIn(rn.nextInt(BOUND));

        for (int i = J; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[INT1]).reportRejected());

    }

}