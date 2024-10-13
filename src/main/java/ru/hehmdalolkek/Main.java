package ru.hehmdalolkek;

import ru.hehmdalolkek.sorting.BubbleSorter;
import ru.hehmdalolkek.sorting.SelectionSorter;
import ru.hehmdalolkek.sorting.Sorter;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class that runs testing of all testing algorithms in the application.
 *
 * @author Inna Badekha
 */
public class Main {

    /**
     * Specifies the initial length of the array when testing.
     */
    private final static int INITIAL_ARRAY_SIZE = 100;

    /**
     * Number of arrays for testing one sorting algorithm.
     */
    private final static int COUNT_OF_ARRAYS = 3;

    /**
     * Entry point to the application.
     * Creates test data {@code TestData}, gets all testing algorithms and starts testing of each algorithm.
     *
     * @param args
     */
    public static void main(String[] args) {
        TestData testData = new TestData(INITIAL_ARRAY_SIZE, COUNT_OF_ARRAYS);
        List<Sorter> sorters = getAllSorters();

        for (Sorter sorter : sorters) {
            SorterTester tester = new SorterTester(testData, sorter);
            tester.runTests();
        }
    }

    /**
     * Creates and returns a {@code List} of all sorting algorithms.
     *
     * @return list of all sorting algorithms
     */
    private static List<Sorter> getAllSorters() {
        List<Sorter> sorters = new ArrayList<>();
        sorters.add(new BubbleSorter());
        return sorters;
    }

}
