package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

/**
 * Klasa RhymersDemo demonstruje działanie różnych implementacji rymowanek
 * dostarczonych przez RhymersFactory. Tworzy instancje rymowanek, wykonuje na nich
 * operacje liczenia i wyświetla wyniki.
 */


//PROJEKT JEST POPRAWNY
class RhymersDemo {

    public static final int INT = 15;
    public static final int I = 1;
    public static final int INT1 = 3;
    public static final int J = 0;
    public static final int BOUND = 20;

    /**
     * Główna metoda demonstracyjna. Inicjalizuje fabrykę rymowanek i uruchamia
     * testowanie rymowanek poprzez wywołanie metody testRhymers.
     *
     * @param args Argumenty wiersza poleceń (nieużywane w tej demonstracji)
     */
    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);
    }

    /**
     * Testuje rymowanki poprzez tworzenie instancji za pomocą podanej fabryki,
     * wykonywanie operacji countIn i wyświetlanie wyników operacji countOut.
     *
     * @param factory Fabryka RhymersFactory używana do tworzenia instancji rymowanek
     */
    public static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
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