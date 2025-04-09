package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    // Stałe związane z maksymalnym rozmiarem stosu
    public static final int MAX_CAPACITY = 12;  // Maksymalna pojemność stosu
    public static final int MIN_CAPACITY = 11;  // Minimalna pojemność stosu (rozmiar pełnego stosu)

    // Tablica przechowująca dane stosu - oznaczenie jako final, ponieważ po jej zainicjalizowaniu nie chcemy jej zmieniać
    private final int[] numbers = new int[MAX_CAPACITY];

    // Stała określająca początkową wartość total (brak elementów na stosie)
    public static final int EMPTY_RHYMER_INDICATOR = -1;

    // Pole przechowujące aktualny stan stosu
    public int total = EMPTY_RHYMER_INDICATOR;

    // Metoda dodająca element na stos
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    // Metoda sprawdzająca, czy stos jest pusty
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    // Metoda sprawdzająca, czy stos jest pełny
    public boolean isFull() {
        return total == MIN_CAPACITY;
    }

    // Metoda do podglądu ostatniego elementu na stosie
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    // Metoda usuwająca element ze stosu
    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}