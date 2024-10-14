package ru.hehmdalolkek;

import ru.hehmdalolkek.sorting.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The main class that runs testing of all testing algorithms in the application.
 *
 * @author Inna Badekha
 */
public class Main {

    /**
     * Default count of arrays for testing one sorting algorithm.
     */
    private static int countOfArrays = 3;

    /**
     * Specifies the default initial length of the array when testing.
     */
    private static int initialArraySize = 100;

    /**
     * Entry point to the application.
     * Gets values of {@code countOfArrays} and {@code initialArraySize}
     * from command-line arguments or uses default values.
     * Creates test data {@code TestData}.
     * Gets all test algorithms and starts testing each algorithm.
     *
     * @param args array with values for fields {@code countOfArrays} and {@code initialArraySize}
     */
    public static void main(String[] args) {
        setParametersOfTest(args);
        TestData testData = new TestData(initialArraySize, countOfArrays);

        for (Sorter sorter : getAllSorters()) {
            SorterTester tester = new SorterTester(testData, sorter);
            tester.runTests();
        }
    }

    /**
     * Gets {@code args} and sets them
     * to replace the default values of
     * {@code countOfArrays} and {@code initialArraySize}.
     *
     * @param args array with values for fields {@code countOfArrays} and {@code initialArraySize}
     */
    private static void setParametersOfTest(String[] args) {
        try {
            if (args.length > 0 && !args[0].isEmpty()) {
                countOfArrays = Integer.parseInt(args[0]);
            }
            if (args.length > 1 && !args[1].isEmpty()) {
                initialArraySize = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid value passed.");
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
        sorters.add(new SelectionSorter());
        sorters.add(new CocktailSorter());
        sorters.add(new InsertionSorter());
        sorters.add(new MergeSorter());
        sorters.add(new QuickSorter());
        sorters.add(new DualPivotQuickSorter());
        return sorters;
    }

}
